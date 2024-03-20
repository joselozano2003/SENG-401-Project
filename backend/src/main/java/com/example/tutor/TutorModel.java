package com.example.tutor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class TutorModel {
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
    private Long tutorId;
    private String[] ableToTeach;
    private int trainingMetric;
    private int userRating;
    private String bio;

    public TutorModel(Long tutorId, String[] ableToTeach,
                      int trainingMetric, int userRating, String bio) {
        this.tutorId = tutorId;
        this.ableToTeach=ableToTeach;
        this.trainingMetric=trainingMetric;
        this.userRating=userRating;
        this.bio=bio;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}