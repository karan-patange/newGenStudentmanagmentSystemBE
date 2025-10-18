package com.example.studentmanagement.service;


import com.example.studentmanagement.entity.CoursedData;

import java.util.List;

public interface CourseDataService  {

    CoursedData addNewCourse (CoursedData coursedData);

    List<CoursedData> getAllCoursesData();

    void deleteCourseById(Long id);
}
