package com.example.studentmanagement.controller;

import com.example.studentmanagement.service.OtpVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private OtpVerificationService otpService;

    @PostMapping("/request-otp")
    public ResponseEntity<?> requestOtp(@RequestParam String username) {
        return otpService.generateOtp(username);
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<?> verifyOtp(@RequestParam String username, @RequestParam String otp) {
        return otpService.verifyOtp(username, otp);
    }
}
