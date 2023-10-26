package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Request;

import java.util.List;


public interface IRequestService {

    List<Request> getRequests();
    Request createRequest(Request request);
    Request getRequest(Long id);
}