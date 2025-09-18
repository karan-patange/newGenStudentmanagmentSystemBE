package com.example.StudentManagement.serviceimpl;

import com.example.StudentManagement.entity.StudentAddress;
import com.example.StudentManagement.entity.StudentsFeesRecords;
import com.example.StudentManagement.entity.StudentsRegistration;
import com.example.StudentManagement.repository.StudentRegistrationRepository;
import com.example.StudentManagement.service.StudentRegistrationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
}
