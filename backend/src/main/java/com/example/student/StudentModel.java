package com.example.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentModel {
    @Id
    @SequenceGenerator(
            name = "tutor_sequence",
            sequenceName = "tutor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tutor_sequence"
    )
    private Long studentId;
    private String[] subjectList;


    public StudentModel(Long id,  String[] subjectList) {
        this.studentId = id;
        this.subjectList = subjectList;

    }

    public Long getId() {
        return studentId;
    }

    public void setId(Long id) {
        this.studentId = studentId;
    }

    public String[] getSubjectList() {
        return subjectList;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}