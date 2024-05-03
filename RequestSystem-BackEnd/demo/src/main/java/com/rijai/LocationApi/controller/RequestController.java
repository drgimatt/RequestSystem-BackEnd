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
    public Request createRequest(@ModelAttribute Request request){
        return requestService.createRequest(request);
    }

    @PutMapping("/api/update-request/{id}")
    public Request updateRequest(@PathVariable Long id, @ModelAttribute Request request) {
        return requestService.updateRequest(id, request);
    }
    @DeleteMapping("/api/delete-request/{id}")
    public void deleteRequest(@PathVariable Long id) {
        requestService.deleteRequest(id);
    }

    @GetMapping("/api/show-request/{id}")
    public Request showRequest(@PathVariable Long id) {
        return requestService.getRequest(id);
    }

    @GetMapping("/api/show-professor-requests/{id}")
    public List<Request> showProfessorsRequest(@PathVariable String id) {
        return requestService.getProfessorRequests(id);
    }

}
