package com.mapuacsa.requestproj.controller;

import com.mapuacsa.requestproj.model.Subjects;
import com.mapuacsa.requestproj.service.ISubjectsService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class SubjectsController {
    @Autowired
    private ISubjectsService subjectsService;

    @PostMapping("/api/create-subject/")
    public Subjects createSubject(@ModelAttribute Subjects subject) {
        return subjectsService.createSubject(subject);
    }

    @GetMapping("/api/subjects")
    public List<Subjects> showAllSubjects() {
        return subjectsService.findAll();
    }

    @GetMapping("/api/show-subject/{id}")
    public Subjects showSubject(@PathVariable Long id) {
        return subjectsService.getSubject(id);
    }

    @PutMapping("/api/update-subject/{id}")
    public Subjects updateSubject(@PathVariable Long id, @ModelAttribute Subjects subject) {
        return subjectsService.updateSubject(id, subject);
    }
    @DeleteMapping("/api/delete-subject/{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectsService.deleteSubject(id);
    }

}
