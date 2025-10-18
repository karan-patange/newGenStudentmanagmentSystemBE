package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.OtpVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtpVerificationRepository extends JpaRepository<OtpVerification,Long> {

    OtpVerification findByUsername(String username);

}
