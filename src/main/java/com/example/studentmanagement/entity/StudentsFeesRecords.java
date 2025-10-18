package com.example.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class StudentsFeesRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long feesId;

    private long feesPaid;

    private long feesRemaining;

    private long feesTotal;
    @OneToOne(mappedBy = "feesRecords")
    @JsonIgnore
    private StudentsRegistration student;

    public long getFeesId() {
        return feesId;
    }

    public void setFeesId(long feesId) {
        this.feesId = feesId;
    }

    public long getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(long feesPaid) {
        this.feesPaid = feesPaid;
    }

    public long getFeesRemaining() {
        return feesRemaining;
    }

    public void setFeesRemaining(long feesRemaining) {
        this.feesRemaining = feesRemaining;
    }

    public long getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(long feesTotal) {
        this.feesTotal = feesTotal;
    }

    public StudentsRegistration getStudent() {
        return student;
    }

    public void setStudent(StudentsRegistration student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentsFeesRecords{" +
                "feesId=" + feesId +
                ", feesPaid=" + feesPaid +
                ", feesRemaining=" + feesRemaining +
                ", feesTotal=" + feesTotal +
                ", student=" + student +
                '}';
    }
}
