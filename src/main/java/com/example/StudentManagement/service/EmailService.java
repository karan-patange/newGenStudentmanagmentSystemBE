package com.example.StudentManagement.service;

public interface EmailService {

    void sendwelomeEmail(String to,String subject, String mailBody);

     void sendCustomeEmail(String to, String subject, String body);

     void sendOtp (String to, String subject, String body);

}
