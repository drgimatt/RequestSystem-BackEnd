package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Person;
import com.rijai.LocationApi.service.IPersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class PersonController {
    @Autowired
    private IPersonService personService;

    @RequestMapping("/api/persons")
    public List<Person> findPerson(){
       return personService.getPersons();
    }

    @RequestMapping("/api/show-person/{id}")
    public Person showPerson(@PathVariable Long id) {
       return personService.getPerson(id);
    }

    @PostMapping("/api/add-person")
    public Person addPerson(@ModelAttribute Person person){
        return personService.createPerson(person);
    }

    @PutMapping("/api/update-person/{id}")
    public Person updatePerson(@PathVariable Long id, @ModelAttribute Person person) {
        return personService.updatePerson(id, person);
    }
    @DeleteMapping("/api/delete-person/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
    }

}
