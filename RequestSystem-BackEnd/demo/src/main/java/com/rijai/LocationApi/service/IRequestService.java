package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Request;

import java.util.List;


public interface IRequestService {

    List<Request> getRequests();
    List<Request> getProfessorRequests(String employeeID);
    Request createRequest(Request request);
    Request getRequest(Long id);
    Request updateRequest(Long id, Request request);
    void deleteRequest(Long id);
    List<Request> getGeneralizedRequests(String arguments);
}