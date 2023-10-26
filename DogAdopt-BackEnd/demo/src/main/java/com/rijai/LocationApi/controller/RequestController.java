package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Request;
import com.rijai.LocationApi.service.IRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class RequestController {
    @Autowired
    private IRequestService requestService;

    @RequestMapping("/api/requests")
    public List<Request> findRequests(){
        return requestService.getRequests();
    }
    @RequestMapping(value="/api/create-request", method= RequestMethod.POST)
    public Request createAccount(@RequestBody Request request) {
        return requestService.createRequest(request);
    }

    @GetMapping(value = "/api/show-request/{id}")
    public Request showRequest(@PathVariable Long id) {
        return requestService.getRequest(id);
    }


}
