package com.example.StudentManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EnquiryForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String StudentName ;
    public String MobileNumber ;
    public String Email;
    public String Qualification ;
    public String PassingYear ;
    public String CourseName;
    public String CourseMode ;
    public String Address ;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public String getPassingYear() {
        return PassingYear;
    }

    public void setPassingYear(String passingYear) {
        PassingYear = passingYear;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseMode() {
        return CourseMode;
    }

    public void setCourseMode(String courseMode) {
        CourseMode = courseMode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "EnquiryForm{" +
                "Id=" + Id +
                ", StudentName='" + StudentName + '\'' +
                ", MobileNumber='" + MobileNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", Qualification='" + Qualification + '\'' +
                ", PassingYear='" + PassingYear + '\'' +
                ", CourseName='" + CourseName + '\'' +
                ", CourseMode='" + CourseMode + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
