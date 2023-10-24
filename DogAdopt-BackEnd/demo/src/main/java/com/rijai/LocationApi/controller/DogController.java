package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.service.IDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class DogController {
    @Autowired
    private IDogService dogService;


    @RequestMapping("/api/dogs")
    public List<Dog> findDogs(){
       return dogService.getDogs();
    }

    @RequestMapping(value = "/api/show-dog/{id}")
    public Dog showDog(@PathVariable Long id) {
       return dogService.getDog(id);
    }

    @RequestMapping(value="/api/add-dog", method= RequestMethod.POST)
    public Dog addDogSubmit(@RequestParam("photo") MultipartFile file, @RequestParam("name") String name, @RequestParam("breed") String breed, @RequestParam("age") int age, @RequestParam("doa") Date doa, @RequestParam("personality") String personality, @RequestParam("status") String status) throws IOException {
        Dog dog = new Dog(null, file.getBytes(), name, breed, age, doa, personality, status);
        return dogService.addDog(dog);
    }

    @RequestMapping(value="/api/update-dog/{id}", method=RequestMethod.PUT)
    public Dog updateDog(@RequestParam("id") Long id,@RequestParam("photo") MultipartFile file, @RequestParam("name") String name, @RequestParam("breed") String breed, @RequestParam("age") int age, @RequestParam("doa") Date doa, @RequestParam("personality") String personality, @RequestParam("status") String status) throws IOException {
        Dog dog = new Dog(id, file.getBytes(), name, breed, age, doa, personality, status);
        return dogService.updateDog(id, dog);
    }
    @RequestMapping(value = "/api/delete-dog/{id}", method = {RequestMethod.DELETE, RequestMethod.POST})
    public String deleteDog(@PathVariable("id") Long id) {
        dogService.deleteDog(id);
        return "redirect:/dogs";
    }

}
