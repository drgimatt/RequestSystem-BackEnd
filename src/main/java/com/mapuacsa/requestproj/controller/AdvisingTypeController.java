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

import com.mapuacsa.requestproj.model.AdvisingType;
import com.mapuacsa.requestproj.service.IAdvisingTypeService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class AdvisingTypeController {
    @Autowired
    private IAdvisingTypeService typeService;

    @PostMapping("/api/create-type/")
    public AdvisingType createAdvisingType(@ModelAttribute AdvisingType type) {
        return typeService.createAdvisingType(type);
    }

    @GetMapping("/api/show-type/{id}")
    public AdvisingType showAdvisingType(@PathVariable Long id) {
        return typeService.findById(id);
    }
    @GetMapping("/api/types")
    public List<AdvisingType> showAllAdvisingTypes() {
        return typeService.findAll();
    }
    @PutMapping("/api/update-type/{id}")
    public AdvisingType updateAdvisingType(@PathVariable Long id, @ModelAttribute AdvisingType type) {
        return typeService.updateAdvisingType(id, type);
    }
    @DeleteMapping("/api/delete-type/{id}")
    public void deleteAdvisingType(@PathVariable Long id) {
        typeService.deleteAdvisingType(id);
    }
    
}
