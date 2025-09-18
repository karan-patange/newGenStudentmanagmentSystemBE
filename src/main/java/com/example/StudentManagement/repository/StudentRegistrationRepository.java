package com.example.StudentManagement.repository;

import com.example.StudentManagement.entity.StudentsRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegistrationRepository extends JpaRepository<StudentsRegistration,Long> {
}
