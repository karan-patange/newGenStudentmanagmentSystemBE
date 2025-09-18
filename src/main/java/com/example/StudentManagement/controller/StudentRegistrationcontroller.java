package com.example.StudentManagement.controller;

import com.example.StudentManagement.entity.StudentsRegistration;
import com.example.StudentManagement.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("getStudentByid/{id}")
    public Optional<StudentsRegistration> getStudentById (@PathVariable Long id){
        return studentRegistrationService.getStudentById(id);
    }

}
