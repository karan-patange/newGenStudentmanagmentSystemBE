package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.EnquiryForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryRepository extends JpaRepository<EnquiryForm , Long> {
}
