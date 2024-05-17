package com.mapuacsa.requestproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapuacsa.requestproj.model.Department;
import com.mapuacsa.requestproj.service.IDepartmentService;

@CrossOrigin(origins = "*")

@RestController

public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @PostMapping("/api/create-department/")
    public Department createDepartment(@ModelAttribute Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/api/show-department/{id}")
    public Department showDepartment(@PathVariable Long id) {
        return departmentService.findById(id);
    }

    @GetMapping("/api/departments")
    public List<Department> showAllDepartments() {
        return departmentService.findAll();
    }

    @PutMapping("/api/update-department/{id}")
    public Department updateDepartment(@PathVariable Long id, @ModelAttribute Department department) {
        return departmentService.updateDepartment(id, department);
    }
    @DeleteMapping("/api/delete-department/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }
    
}
