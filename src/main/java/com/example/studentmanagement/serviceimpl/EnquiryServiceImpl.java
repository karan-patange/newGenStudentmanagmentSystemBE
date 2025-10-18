package com.example.studentmanagement.serviceimpl;

import com.example.studentmanagement.entity.EnquiryForm;
import com.example.studentmanagement.repository.EnquiryRepository;
import com.example.studentmanagement.service.EnquiryService;
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
