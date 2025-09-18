package com.example.StudentManagement.serviceimpl;

import com.example.StudentManagement.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    MailSender mailSender;

    @Override
    public void sendwelomeEmail(String to, String subject, String mailBody) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("newgensoftech.pune@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(mailBody);
        mailSender.send(message);


    }
}
