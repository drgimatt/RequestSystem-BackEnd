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
    @PostMapping("/api/create-request")
    public Request createRequest(@RequestBody Request request){
        return requestService.createRequest(request);
    }

    @PutMapping("/api/update-request/{id}")
    public Request updateRequest(@PathVariable Long id, @RequestBody Request request) {
        return requestService.updateRequest(id, request);
    }
    @RequestMapping(value = "/api/delete-request/{id}", method = {RequestMethod.DELETE, RequestMethod.POST})
    public void deleteRequest(@PathVariable Long id) {
        requestService.deleteRequest(id);
    }

    @GetMapping(value = "/api/show-request/{id}")
    public Request showRequest(@PathVariable Long id) {
        return requestService.getRequest(id);
    }


}
