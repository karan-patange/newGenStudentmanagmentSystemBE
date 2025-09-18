package com.example.StudentManagement.service;

import com.example.StudentManagement.entity.StudentsRegistration;

import java.util.Optional;

public interface StudentRegistrationService {

    StudentsRegistration newStudentRegistration (StudentsRegistration studentsRegistration);
    Optional<StudentsRegistration> getStudentById (long id);

}
