package com.mapuacsa.requestproj.controller;

import com.mapuacsa.requestproj.model.UserRoles;
import com.mapuacsa.requestproj.service.IUserRolesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class UserRolesController {
    @Autowired
    private IUserRolesService userRolesService;

    @PostMapping("/api/create-role/")
    public UserRoles createRole(@ModelAttribute UserRoles role) {
        return userRolesService.createRole(role);
    }

    @GetMapping("/api/show-role/{id}")
    public UserRoles showRole(@PathVariable Long id) {
        return userRolesService.getRole(id);
    }

    @GetMapping("/api/roles")
    public List<UserRoles> showAllRoles() {
        return userRolesService.findAll();
    }

    @PutMapping("/api/update-role/{id}")
    public UserRoles updateRole(@PathVariable Long id, @ModelAttribute UserRoles role) {
        return userRolesService.updateRole(id, role);
    }
    @DeleteMapping("/api/delete-role/{id}")
    public void deleteRole(@PathVariable Long id) {
        userRolesService.deleteRole(id);
    }

}
