package com.rijai.LocationApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rijai.LocationApi.model.Priority;
import com.rijai.LocationApi.service.IPriorityService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class PriorityController {
    @Autowired
    private IPriorityService priorityService;

    @PostMapping("/api/create-priority")
    public Priority createPriority(@RequestBody Priority priority) {
        return priorityService.createPriority(priority);
    }

    @GetMapping("/api/show-priority/{id}")
    public Priority showPriority(@PathVariable Long id) {
        return priorityService.findById(id);
    }

    @PutMapping("/api/update-priority/{id}")
    public Priority updatePriority(@PathVariable Long id, @RequestBody Priority priority) {
        return priorityService.updatePriority(id, priority);
    }
    @DeleteMapping("/api/delete-priority/{id}")
    public void deletePriority(@PathVariable Long id) {
        priorityService.deletePriority(id);
    }
    
}
