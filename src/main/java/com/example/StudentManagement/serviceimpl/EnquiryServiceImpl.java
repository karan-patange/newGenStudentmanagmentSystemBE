package com.example.StudentManagement.serviceimpl;

import com.example.StudentManagement.entity.EnquiryForm;
import com.example.StudentManagement.repository.EnquiryRepository;
import com.example.StudentManagement.service.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnquiryServiceImpl implements EnquiryService {
    @Autowired
    EnquiryRepository enquiryRepository;

    @Override
    public EnquiryForm newEnquier(EnquiryForm enquiryForm) {

        System.out.println("enquiry saved in dayabase.....!!");

        return enquiryRepository.save(enquiryForm);
    }
}
