package com.example.StudentManagement.serviceimpl;

import com.example.StudentManagement.entity.StudentAddress;
import com.example.StudentManagement.entity.StudentsFeesRecords;
import com.example.StudentManagement.entity.StudentsRegistration;
import com.example.StudentManagement.repository.StudentRegistrationRepository;
import com.example.StudentManagement.service.EmailService;
import com.example.StudentManagement.service.StudentRegistrationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {
    @Autowired
    StudentRegistrationRepository studentRegistrationRepository;

    @Override
    public StudentsRegistration newStudentRegistration(StudentsRegistration student) {
        StudentsFeesRecords fees = new StudentsFeesRecords();
        fees.setFeesTotal(40000);
        fees.setFeesPaid(20000);
        fees.setFeesRemaining(fees.getFeesTotal()-fees.getFeesPaid());

        student.setFeesRecords(fees);
        fees.setStudent(student);


        StudentAddress address = new StudentAddress();
        address.setCity(student.getStudentAddress().getCity());
        address.setState(student.getStudentAddress().getState());
        address.setPinCode(student.getStudentAddress().getPinCode());

        student.setStudentAddress(address);

        address.setStudent(student);
        return studentRegistrationRepository.save(student);
    }

    @Override
    public Optional<StudentsRegistration> getStudentById(long id) {

        return studentRegistrationRepository.findById(id);
            }


    @Override
    public String deleteStudentById(long id) {
        studentRegistrationRepository.deleteById(id);
        return "Student Deleted with id " + id;
    }


    @Autowired
    EmailService emailService;

    @Override
    public List<StudentsRegistration> getAllRegistration() {
        return studentRegistrationRepository.findAll();
    }

    @Override
    public void sendMailToAllGirls(String subject, String body) {
        List<StudentsRegistration> girls = studentRegistrationRepository.findByGenderIgnoreCase("Female");
       if(girls.isEmpty()){
           throw new RuntimeException("no girls present in database....!!!!");
       }

        for (StudentsRegistration s : girls) {
            emailService.sendCustomeEmail(s.getStudentEmailId(), subject, body);
        }
    }






    @Override
    public void sendMailToAllStudents(String subject, String body) {
        List<StudentsRegistration> students = studentRegistrationRepository.findAll();
        for (StudentsRegistration s : students) {
            emailService.sendCustomeEmail(s.getStudentEmailId(), subject, body);
        }
    }


    @Override
    public void sendMailToNinetyPercentPaid(String subject, String body) {
        List<StudentsRegistration> students = studentRegistrationRepository.findAll();
        for (StudentsRegistration s : students) {
            if (s.getFeesRecords() != null) {
                long total = s.getFeesRecords().getFeesTotal();
                long paid = s.getFeesRecords().getFeesPaid();
                if (total > 0 && (paid / total) >= 0.9) {
                    System.out.println("this student is paid 90 " + s.getStudentEmailId().toString());
                    emailService.sendCustomeEmail(s.getStudentEmailId(), subject, body);
                }
            }
        }
    }

}
