package com.example.backend.tutor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("api/v1/tutor")
public class TutorController {
    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String("List of tutors");
    }

    @PostMapping
    public String postMethodName(@RequestBody String entity) {
        return tutorService.addTutor(entity);
    }

    @DeleteMapping
    public String deleteMethodName(@RequestParam String param) {
        return tutorService.deleteTutor(param);
    }

    @PutMapping(path = "{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        return tutorService.updateTutor(id, entity);
    }


}