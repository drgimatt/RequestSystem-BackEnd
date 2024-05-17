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

import com.mapuacsa.requestproj.model.FormType;
import com.mapuacsa.requestproj.service.IFormTypeService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class FormTypeController {
    @Autowired
    private IFormTypeService formTypeService;

    @PostMapping("/api/create-formtype/")
    public FormType createFormType(@ModelAttribute FormType formtype) {
        return formTypeService.createFormType(formtype);
    }

    @GetMapping("/api/formtypes")
    public List<FormType> showAllFormTypes() {
        return formTypeService.findAll();
    }

    @GetMapping("/api/show-formtype/{id}")
    public FormType showFormType(@PathVariable Long id) {
        return formTypeService.findById(id);
    }

    @PutMapping("/api/update-formtype/{id}")
    public FormType updateFormType(@PathVariable Long id, @ModelAttribute FormType formtype) {
        return formTypeService.updateFormType(id, formtype);
    }
    @DeleteMapping("/api/delete-formtype/{id}")
    public void deleteFormType(@PathVariable Long id) {
        formTypeService.deleteFormType(id);
    }
    
}
