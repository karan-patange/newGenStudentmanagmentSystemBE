package com.example.studentmanagement.controller;

import com.example.studentmanagement.constants.Constants;
import com.example.studentmanagement.entity.EnquiryForm;
import com.example.studentmanagement.kafka.Producer;
import com.example.studentmanagement.service.EmailService;
import com.example.studentmanagement.service.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enquiry")
@CrossOrigin("http://localhost:4200/")
public class EnquiryController {

    @Autowired
    EnquiryService enquiryService;

    @Autowired
    EmailService emailService;


    @Autowired
    Constants constants;


    @Autowired
    Producer producer;


    @PostMapping("/newEnquiry")
    public EnquiryForm newEnquiry(@RequestBody EnquiryForm enquiryForm){
        emailService.sendwelomeEmail(enquiryForm.getEmail(), "welcme to newgen family...!!","dear, "+ enquiryForm.getStudentName() + "\n thank you for registering with us, \n\n oue team will conect with you shortly...!! \n\n\n " + constants.mailRegards );
        //producer.sendWelcomeEmail(enquiryForm.getEmail());
        return enquiryService.newEnquier(enquiryForm);
    }
}
