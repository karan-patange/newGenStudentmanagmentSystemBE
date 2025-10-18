package com.example.studentmanagement.service;

import org.springframework.http.ResponseEntity;

public interface OtpVerificationService {


    public ResponseEntity<?> generateOtp(String username);

    public ResponseEntity<?> verifyOtp(String username, String otp);
}
