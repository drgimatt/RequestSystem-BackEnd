package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Subjects;
import com.rijai.LocationApi.service.ISubjectsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class SubjectsController {
    @Autowired
    private ISubjectsService subjectsService;


    // @GetMapping("/api/users/{username}/{password}")
    // public Account requestAccount(@PathVariable Map<String, String> pathVarsMap) {
    //     return accountService.doesUserExist(pathVarsMap.get("username"), pathVarsMap.get("password"));
    // }

    @PostMapping("/api/create-subject")
    public Subjects createSubject(@RequestBody Subjects subject) {
        return subjectsService.createSubject(subject);
    }

    @GetMapping("/api/show-subjects")
    public List<Subjects> showAllSubjects() {
        return subjectsService.findAll();
    }

    @GetMapping("/api/show-subject/{id}")
    public Subjects showSubject(@PathVariable Long id) {
        return subjectsService.getSubject(id);
    }

    @PutMapping("/api/update-subject/{id}")
    public Subjects updateSubject(@PathVariable Long id, @RequestBody Subjects subject) {
        return subjectsService.updateSubject(id, subject);
    }
    @DeleteMapping("/api/delete-subject/{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectsService.deleteSubject(id);
    }

}
