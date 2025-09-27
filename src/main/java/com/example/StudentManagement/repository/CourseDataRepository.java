package com.example.StudentManagement.repository;

import com.example.StudentManagement.entity.CoursedData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDataRepository extends JpaRepository<CoursedData,Long> {
}
