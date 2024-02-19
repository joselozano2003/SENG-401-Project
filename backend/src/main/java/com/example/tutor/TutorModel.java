package com.example.tutor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
class TutorModel {
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
    private Long id;
    private String name;
    private String subject;
    private String email;
    private String phone;

    public TutorModel(Long id, String name, String subject, String email, String phone) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.email = email;
        this.phone = phone;
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