package com.example.StudentManagement.service;


import com.example.StudentManagement.entity.CoursedData;

import java.util.List;

public interface CourseDataService  {

    CoursedData addNewCourse (CoursedData coursedData);

    List<CoursedData> getAllCoursesData();

    void deleteCourseById(Long id);
}
