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

import com.rijai.LocationApi.model.Department;
import com.rijai.LocationApi.service.IDepartmentService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @PostMapping("/api/create-department")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping(value = "/api/show-department/{id}")
    public Department showDepartment(@PathVariable Long id) {
        return departmentService.findById(id);
    }

    @PutMapping("/api/update-role/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        return departmentService.updateDepartment(id, department);
    }
    @DeleteMapping(value = "/api/delete-department/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }
    
}