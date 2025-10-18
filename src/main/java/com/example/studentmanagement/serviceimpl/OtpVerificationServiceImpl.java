package com.example.studentmanagement.serviceimpl;

import com.example.studentmanagement.entity.OtpVerification;
import com.example.studentmanagement.entity.Users;
import com.example.studentmanagement.repository.OtpVerificationRepository;
import com.example.studentmanagement.repository.UsersRepository;
import com.example.studentmanagement.service.EmailService;
import com.example.studentmanagement.service.OtpVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OtpVerificationServiceImpl implements OtpVerificationService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    OtpVerificationRepository otpVerificationRepository;

    @Autowired
    EmailService emailService;


    @Override
    public ResponseEntity<?> generateOtp(String username) {
        Users user = usersRepository.findByUserName(username);


        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "User not found"));
        }

        String otp = String.valueOf((int)(Math.random() * 9000) + 1000);
        long expiryTime = System.currentTimeMillis() + (5 * 60 * 1000);

        OtpVerification existing = otpVerificationRepository.findByUsername(username);
        if (existing != null) {
            existing.setOtp(otp);
            existing.setExpiryTime(expiryTime);
            otpVerificationRepository.save(existing);
        } else {
            OtpVerification otpVerification = new OtpVerification();
            otpVerification.setUsername(username);
            otpVerification.setOtp(otp);
            otpVerification.setExpiryTime(expiryTime);
            otpVerificationRepository.save(otpVerification);
        }


        emailService.sendOtp(user.getEmailId(),"OTP for Login ",
                "Your OTP for login as follows \n : " + otp +
                        "\n this OTP will valid for 5 minuts only " +
                        "\n\n Do not share with anyone " +
                        "\n\n\n\n\n Regards, " +
                        "\n NewGen SoftTech," +
                        "\n Pune");

        System.out.println("OTP for " + username + " = " + otp);

        return ResponseEntity.ok(Map.of("message", "OTP sent successfully"));
    }









    @Override
    public ResponseEntity<?> verifyOtp(String username, String otp) {
        OtpVerification otpData = otpVerificationRepository.findByUsername(username);

        if (otpData == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "OTP not found. Please request again."));
        }

        if (System.currentTimeMillis() > otpData.getExpiryTime()) {
            return ResponseEntity.badRequest()
                    .body(Map.of("message", "OTP expired. Please request again."));
        }

        if (otpData.getOtp().equals(otp)) {
            return ResponseEntity.ok(Map.of("message", "Login successful!"));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "Invalid OTP!"));
        }
    }
}
