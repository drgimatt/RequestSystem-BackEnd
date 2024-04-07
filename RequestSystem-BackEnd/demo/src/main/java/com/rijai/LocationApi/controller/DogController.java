package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.service.IDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
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

    @PostMapping("/api/add-dog")
    public Dog addDogSubmit(@RequestParam(value = "photo", required = false) MultipartFile file, @RequestParam String name, @RequestParam String breed, @RequestParam int age, @RequestParam Date doa, @RequestParam String personality, @RequestParam String status, @RequestParam String gender) throws IOException {
        byte[] bytes = null;
        if (file != null) {
            bytes = file.getBytes();
        }
        Dog dog = new Dog(null, bytes, name, breed, age, doa, personality, status, gender);
        return dogService.addDog(dog);

    }

    @PutMapping("/api/update-dog/{id}")
    public Dog updateDog(@RequestParam Long id, @RequestParam(value = "photo", required = false) MultipartFile file, @RequestParam String name, @RequestParam String breed, @RequestParam int age, @RequestParam Date doa, @RequestParam String personality, @RequestParam String status, @RequestParam String gender) throws IOException {
        byte[] bytes = null;
        if (file != null) {
            bytes = file.getBytes();
        }
        else{
            Dog dog = dogService.getDog(id);
            bytes = dog.getPhoto();
        }
        Dog dog = new Dog(id, bytes, name, breed, age, doa, personality, status, gender);
        return dogService.updateDog(id, dog);
    }
    @DeleteMapping("/api/delete-dog/{id}")
    public void deleteDog(@PathVariable Long id) {
        dogService.deleteDog(id);
    }

}
