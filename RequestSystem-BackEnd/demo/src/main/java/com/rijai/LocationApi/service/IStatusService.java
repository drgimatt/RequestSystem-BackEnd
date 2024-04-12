package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Status;

import java.util.List;


public interface IStatusService {

    List<Status> findAll();
    //Status doesStatusExist(String status);
    Status createStatus(Status status);
    Status updateStatus(Long id, Status status);
    void deleteStatus(Long id);
    Status findById(Long id);
    Status getStatus(Long id);
}