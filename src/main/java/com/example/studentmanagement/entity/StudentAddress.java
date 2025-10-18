package com.example.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class StudentAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;
    private String city;
    private String state;
    private long pinCode;

    @OneToOne(mappedBy = "studentAddress")
    @JsonIgnore
    private StudentsRegistration student;

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public StudentsRegistration getStudent() {
        return student;
    }

    public void setStudent(StudentsRegistration student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", State='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", student=" + student +
                '}';
    }
}
