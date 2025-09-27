package com.example.StudentManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@RequestMapping("/CoursedData")
public class CoursedData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseId;
    private String courseName;
    private String duration;

    private String discription;

    private long courseFees;

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public long getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(long courseFees) {
        this.courseFees = courseFees;
    }

    @Override
    public String toString() {
        return "CoursedData{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                ", discription='" + discription + '\'' +
                ", courseFees=" + courseFees +
                '}';
    }
}
