package com.example.StudentManagement.serviceimpl;

import com.example.StudentManagement.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    MailSender mailSender;

    @Override
    @Async
   // @KafkaListener(topics = "welcome-topic")
    public void sendwelomeEmail(String to, String subject, String mailBody) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("newgensoftech.pune@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(mailBody);
        mailSender.send(message);

        System.out.println("MAIL SEND SUCCESFULLY.....!!!!");


    }

    @Value("${spring.mail.username}")  // pulls from application.properties
    private String fromEmail;

    @Override
    @Async
    public void sendCustomeEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }
}
