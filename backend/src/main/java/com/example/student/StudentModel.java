package com.example.student;

import jakarta.persistence.*;

import java.util.ArrayList;

import com.example.login.LoginUser;

@Entity
@Table(name = "student")
public class StudentModel extends LoginUser {
    @OneToOne
    @JoinColumn(name = "user_id")
    private LoginUser user;
    @ElementCollection
    private ArrayList<String> whatHelp;

    public StudentModel() {
    }

    public Long getId() {
        return super.getId();
    }

    public void setId(Long studentId) {
        super.setId(studentId);
    }

    public ArrayList<String> getHelpList() {
        return whatHelp;
    }
    public void setHelpList(ArrayList<String> subjectList) {this.whatHelp.addAll(subjectList);}

    public void addHelp(String subject){ this.whatHelp.add(subject);  }

    public void removeHelps(ArrayList<String> remove){ this.whatHelp.removeAll(remove);}

    public void removeHelp(String remove){ this.whatHelp.remove(remove);}
}