package com.rijai.LocationApi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rijai.LocationApi.model.Account;
import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.model.Request;
import com.rijai.LocationApi.service.IAccountService;
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
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/api/requests")
    public List<Request> findRequests(){
        return requestService.getRequests();
    }
    @PostMapping("/api/create-request")
    public Request createRequest(@RequestParam("dogId") Long did, @RequestParam("userId") Long uid, @RequestParam String name, @RequestParam String contact, @RequestParam String message, @RequestParam String status) throws JsonMappingException, JsonProcessingException {
        // Fetch the Dog from the database based on the provided dogId
        Dog dog = dogService.getDog(did);
        Account account = accountService.getAccount(uid);
    
        // Create a new Request object with the retrieved Dog
        Request request = new Request(null, dog.getId(), account.getMyId(), name, contact, message, status);
    
        // Persist the Request object in the database
        return requestService.createRequest(request);
    }

    @PutMapping("/api/update-request/{id}")
    public Request updateRequest(@PathVariable Long id, @RequestBody Request request) {
        return requestService.updateRequest(id, request);
    }
    

    @GetMapping(value = "/api/show-request/{id}")
    public Request showRequest(@PathVariable Long id) {
        return requestService.getRequest(id);
    }


}
