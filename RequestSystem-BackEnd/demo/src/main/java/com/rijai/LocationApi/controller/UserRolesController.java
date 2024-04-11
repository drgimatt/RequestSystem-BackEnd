package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.UserRoles;
import com.rijai.LocationApi.service.IUserRolesService;
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

    @GetMapping(value = "/api/show-role/{id}")
    public UserRoles showRole(@PathVariable Long id) {
        return userRolesService.getRole(id);
    }

    @PutMapping("/api/update-role/{id}")
    public UserRoles updateRole(@PathVariable Long id, @RequestBody UserRoles role) {
        return userRolesService.updateRole(id, role);
    }
    @RequestMapping(value = "/api/delete-role/{id}", method = {RequestMethod.DELETE, RequestMethod.POST})
    public void deleteRole(@PathVariable Long id) {
        userRolesService.deleteRole(id);
    }

}
