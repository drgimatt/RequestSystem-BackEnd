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

import com.rijai.LocationApi.model.AdvisingType;
import com.rijai.LocationApi.service.IAdvisingTypeService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class AdvisingTypeController {
    @Autowired
    private IAdvisingTypeService typeService;

    @PostMapping("/api/create-type")
    public AdvisingType createAdvisingType(@RequestBody AdvisingType type) {
        return typeService.createAdvisingType(type);
    }

    @GetMapping("/api/show-type/{id}")
    public AdvisingType showAdvisingType(@PathVariable Long id) {
        return typeService.findById(id);
    }

    @PutMapping("/api/update-role/{id}")
    public AdvisingType updateAdvisingType(@PathVariable Long id, @RequestBody AdvisingType type) {
        return typeService.updateAdvisingType(id, type);
    }
    @DeleteMapping("/api/delete-type/{id}")
    public void deleteAdvisingType(@PathVariable Long id) {
        typeService.deleteAdvisingType(id);
    }
    
}
