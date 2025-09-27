package com.example.StudentManagement.controller;

import com.example.StudentManagement.entity.StudentsRegistration;
import com.example.StudentManagement.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentRegistration")
public class StudentRegistrationcontroller {

    @Autowired
    StudentRegistrationService studentRegistrationService;

    @PostMapping("/newStudentRegistration")
    public StudentsRegistration newStudentRegistration (@RequestBody StudentsRegistration studentsRegistration){
        return studentRegistrationService.newStudentRegistration(studentsRegistration);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable Long id){

        studentRegistrationService.deleteStudentById(id);
        return "student deleted with id : " + id;
    }

     @GetMapping("/getAllStudents")
    public List<StudentsRegistration> getAllStudents(){
        return studentRegistrationService.getAllRegistration();
    }



    //API for girls
    @PostMapping("/sendEmailToGirls")
    public String sendMailToGirls(@RequestParam String subject, @RequestParam String body) {
        studentRegistrationService.sendMailToAllGirls(subject, body);
        return "Emails sent to all girls!";
    }


    //API for all students
    @PostMapping("/sendEmailToAll")
    public String sendMailToAll(@RequestParam String subject, @RequestParam String body) {
        studentRegistrationService.sendMailToAllStudents(subject, body);
        return "Emails sent to all students!";
    }

    //API for students with >= 90% fees paid
    @PostMapping("/sendEmailToFees90")
    public String sendMailToNinetyPercent(@RequestParam String subject, @RequestParam String body) {
        studentRegistrationService.sendMailToNinetyPercentPaid(subject, body);
        return "Emails sent to students who paid >= 90% fees!";
    }






    @GetMapping("getStudentByid/{id}")
    public Optional<StudentsRegistration> getStudentById (@PathVariable Long id ){

        return studentRegistrationService.getStudentById(id);

    }









}
