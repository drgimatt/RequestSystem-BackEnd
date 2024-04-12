package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.UserRoles;
import com.rijai.LocationApi.service.IUserRolesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class UserRolesController {
    @Autowired
    private IUserRolesService userRolesService;


    // @GetMapping("/api/users/{username}/{password}")
    // public Account requestAccount(@PathVariable Map<String, String> pathVarsMap) {
    //     return accountService.doesUserExist(pathVarsMap.get("username"), pathVarsMap.get("password"));
    // }

    @PostMapping("/api/create-role")
    public UserRoles createRole(@RequestBody UserRoles role) {
        return userRolesService.createRole(role);
    }

    @GetMapping("/api/show-role/{id}")
    public UserRoles showRole(@PathVariable Long id) {
        return userRolesService.getRole(id);
    }

    @GetMapping("/api/show-roles")
    public List<UserRoles> showAllRoles() {
        return userRolesService.findAll();
    }

    @PutMapping("/api/update-role/{id}")
    public UserRoles updateRole(@PathVariable Long id, @RequestBody UserRoles role) {
        return userRolesService.updateRole(id, role);
    }
    @DeleteMapping("/api/delete-role/{id}")
    public void deleteRole(@PathVariable Long id) {
        userRolesService.deleteRole(id);
    }

}
