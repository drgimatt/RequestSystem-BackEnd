package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.service.IDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class DogController {
    @Autowired
    private IDogService dogService;


    @RequestMapping("/api/dogs")
    public List<Dog> findCountries(){
       return dogService.getDogs();
    }

    @RequestMapping(value = "/api/show-dog/{id}")
    public Dog showCountry(@PathVariable Long id) {
       return dogService.getDog(id);
    }

    @RequestMapping(value="/api/add-dog", method= RequestMethod.POST)
    public Dog addCountrySubmit(@RequestBody Dog country) {
        return dogService.addDog(country);
    }

    @RequestMapping(value="/api/update-dog/{id}", method=RequestMethod.PUT)
    public Dog updateCountry(@PathVariable Long id, @RequestBody Dog dog) {
        return dogService.updateDog(id, dog);
    }
    @RequestMapping(value = "/api/delete-dog/{id}", method = {RequestMethod.DELETE, RequestMethod.POST})
    public String deleteDog(@PathVariable("id") Long id) {
        dogService.deleteDog(id);
        return "redirect:/countries";
    }

}
