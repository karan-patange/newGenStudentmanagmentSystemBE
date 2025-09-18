package com.example.StudentManagement.controller;

import com.example.StudentManagement.constants.Constants;
import com.example.StudentManagement.entity.EnquiryForm;
import com.example.StudentManagement.repository.EnquiryRepository;
import com.example.StudentManagement.service.EmailService;
import com.example.StudentManagement.service.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enquiry")
@CrossOrigin()
public class EnquiryController {

    @Autowired
    EnquiryService enquiryService;

    @Autowired
    EmailService emailService;


    @Autowired
    Constants constants;




    @PostMapping("/newEnquiry")
    public EnquiryForm newEnquiry(@RequestBody EnquiryForm enquiryForm){
        emailService.sendwelomeEmail(enquiryForm.getEmail(), "welcme to newgen family...!!","dear, "+ enquiryForm.getStudentName() + "\n thank you for registering with us, \n\n oue team will conect with you shortly...!! \n\n\n " + constants.mailRegards );

        return enquiryService.newEnquier(enquiryForm);
    }
}
