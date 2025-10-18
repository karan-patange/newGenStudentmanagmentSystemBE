package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.CoursedData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDataRepository extends JpaRepository<CoursedData,Long> {
}
