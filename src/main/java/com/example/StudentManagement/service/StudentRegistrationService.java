package com.example.StudentManagement.service;

import com.example.StudentManagement.entity.StudentsRegistration;

import java.util.List;
import java.util.Optional;

public interface StudentRegistrationService {

    StudentsRegistration newStudentRegistration (StudentsRegistration studentsRegistration);

    Optional<StudentsRegistration> getStudentById (long id);

    String deleteStudentById (long id);

    List<StudentsRegistration> getAllRegistration();

    public void sendMailToAllGirls(String subject, String body);

    void sendMailToAllStudents(String subject, String body);

    public void sendMailToNinetyPercentPaid(String subject, String body);
}
