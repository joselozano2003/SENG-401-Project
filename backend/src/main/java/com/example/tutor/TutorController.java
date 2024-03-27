package com.example.tutor;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api/v1/tutor")
class TutorController {

    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    @GetMapping
    public String getMethodName() {
        return new String("Hello World");
    }

    @PostMapping("subject")
    public String addSubjects(@RequestBody List<String> subjects) {
        tutorService.addSubjects(subjects);
        return new String("Subject added");
    }
}