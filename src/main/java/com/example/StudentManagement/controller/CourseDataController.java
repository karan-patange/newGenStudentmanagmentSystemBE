package com.example.StudentManagement.controller;

import com.example.StudentManagement.entity.CoursedData;
import com.example.StudentManagement.service.CourseDataService;
import jdk.dynalink.linker.LinkerServices;
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
