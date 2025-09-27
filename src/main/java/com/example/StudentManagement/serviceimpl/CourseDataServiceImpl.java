package com.example.StudentManagement.serviceimpl;

import com.example.StudentManagement.entity.CoursedData;
import com.example.StudentManagement.repository.CourseDataRepository;
import com.example.StudentManagement.service.CourseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDataServiceImpl implements CourseDataService {

    @Autowired
    CourseDataRepository courseDataRepository;


    @Override
    public CoursedData addNewCourse(CoursedData coursedData) {
        return  courseDataRepository.save(coursedData);


    }

    @Override
    public List<CoursedData> getAllCoursesData() {

       return courseDataRepository.findAll();

    }

    @Override
    public void deleteCourseById(Long id) {
        if (!courseDataRepository.existsById(id)){
            throw new RuntimeException("Course with id,  "+ id +" is not present ..!!");
        }courseDataRepository.deleteById(id);


    }
}
