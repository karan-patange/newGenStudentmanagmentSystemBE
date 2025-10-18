
package com.example.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class StudentSelectedCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long courceId;

    private String courceName;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkCources")
   // @JsonIgnore
    @JsonBackReference
    private StudentsRegistration student;


    public long getCourceId() {
        return courceId;
    }

    public void setCourceId(long courceId) {
        this.courceId = courceId;
    }

    public String getCourceName() {
        return courceName;
    }

    public void setCourceName(String courceName) {
        this.courceName = courceName;
    }

    public StudentsRegistration getStudent() {
        return student;
    }

    public void setStudent(StudentsRegistration student) {
        this.student = student;
    }


    @Override
    public String toString() {
        return "Cources{" +
                "courceId=" + courceId +
                ", courceName='" + courceName + '\'' +
                ", student=" + student +
                '}';
    }
}

