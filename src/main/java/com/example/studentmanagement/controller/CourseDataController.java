package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.CoursedData;
import com.example.studentmanagement.service.CourseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseData")
public class CourseDataController {

    @Autowired
    CourseDataService courseDataService;

    @PostMapping("/addNewCourse")
    public CoursedData addNewCourse (@RequestBody CoursedData coursedData){
        return  courseDataService.addNewCourse(coursedData);
    }


    @GetMapping("/getAllCoursesData")
    public List<CoursedData> getAllCouseData(){
        return courseDataService.getAllCoursesData();
    }

    @DeleteMapping("/deleteCourseById/{id}")
    public String deleteCourseById (@PathVariable Long id){
        courseDataService.deleteCourseById(id);
        return "Course Deleted By Id" + id;
    }
}
