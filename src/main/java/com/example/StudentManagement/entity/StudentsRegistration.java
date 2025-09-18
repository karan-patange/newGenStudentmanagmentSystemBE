package com.example.StudentManagement.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class StudentsRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    private String studentName;

    private String studentMobileNumber;

    private String studentEmailId;

    private String highestQualification;

    private String passingYear;

    private String gender;

    private LocalDate dateOfBirth;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkFees")   // StudentsRegistration owns the FK column
    private StudentsFeesRecords feesRecords;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkAddress") // StudentsRegistration owns the FK column
    private StudentAddress studentAddress;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMobileNumber() {
        return studentMobileNumber;
    }

    public void setStudentMobileNumber(String studentMobileNumber) {
        this.studentMobileNumber = studentMobileNumber;
    }

    public String getStudentEmailId() {
        return studentEmailId;
    }

    public void setStudentEmailId(String studentEmailId) {
        this.studentEmailId = studentEmailId;
    }

    public String getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(String highestQualification) {
        this.highestQualification = highestQualification;
    }

    public String getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(String passingYear) {
        this.passingYear = passingYear;
    }

    public StudentsFeesRecords getFeesRecords() {
        return feesRecords;
    }

    public void setFeesRecords(StudentsFeesRecords feesRecords) {
        this.feesRecords = feesRecords;
    }

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "StudentsRegistration{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMobileNumber='" + studentMobileNumber + '\'' +
                ", studentEmailId='" + studentEmailId + '\'' +
                ", highestQualification='" + highestQualification + '\'' +
                ", passingYear='" + passingYear + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", feesRecords=" + feesRecords +
                ", studentAddress=" + studentAddress +
                '}';
    }
}


































































































































































































































































