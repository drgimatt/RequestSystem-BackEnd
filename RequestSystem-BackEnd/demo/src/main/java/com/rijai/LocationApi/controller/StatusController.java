package com.rijai.LocationApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rijai.LocationApi.model.Status;
import com.rijai.LocationApi.service.IStatusService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class StatusController {
    @Autowired
    private IStatusService statusService;

    @PostMapping("/api/create-status")
    public Status createStatus(@RequestBody Status status) {
        return statusService.createStatus(status);
    }

    @GetMapping("/api/status")
    public List<Status> showAllStatuses() {
        return statusService.findAll();
    }

    @GetMapping("/api/show-status/{id}")
    public Status showStatus(@PathVariable Long id) {
        return statusService.findById(id);
    }

    @PutMapping("/api/update-status/{id}")
    public Status updateStatus(@PathVariable Long id, @RequestBody Status status) {
        return statusService.updateStatus(id, status);
    }
    @DeleteMapping("/api/delete-status/{id}")
    public void deleteStatus(@PathVariable Long id) {
        statusService.deleteStatus(id);
    }
    
}
