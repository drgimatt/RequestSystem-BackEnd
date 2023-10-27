package com.rijai.LocationApi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.model.Request;
import com.rijai.LocationApi.service.IDogService;
import com.rijai.LocationApi.service.IRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class RequestController {
    @Autowired
    private IRequestService requestService;
    @Autowired
    private IDogService dogService;

    @RequestMapping("/api/requests")
    public List<Request> findRequests(){
        return requestService.getRequests();
    }
    @RequestMapping(value="/api/create-request", method= RequestMethod.POST)
    public Request createRequest(@RequestParam("dogId") Long id, @RequestParam("name") String name, @RequestParam("contact") String contact, @RequestParam("message") String message) throws JsonMappingException, JsonProcessingException {
        // Fetch the Dog from the database based on the provided dogId
        Dog dog = dogService.getDog(id);
    
        // Create a new Request object with the retrieved Dog
        Request request = new Request(null, dog.getId(), name, contact, message);
    
        // Persist the Request object in the database
        return requestService.createRequest(request);
    }
    

    @GetMapping(value = "/api/show-request/{id}")
    public Request showRequest(@PathVariable Long id) {
        return requestService.getRequest(id);
    }


}
