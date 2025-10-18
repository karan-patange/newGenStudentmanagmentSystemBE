package com.example.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "otp_verification")
public class OtpVerification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String otp;

    private long expiryTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public long getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(long expiryTime) {
        this.expiryTime = expiryTime;
    }


    @Override
    public String toString() {
        return "OtpVerification{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", otp='" + otp + '\'' +
                ", expiryTime=" + expiryTime +
                '}';
    }
}




