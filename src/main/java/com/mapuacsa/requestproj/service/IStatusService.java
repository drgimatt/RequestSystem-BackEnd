package com.mapuacsa.requestproj.service;

import com.mapuacsa.requestproj.model.Status;

import java.util.List;


public interface IStatusService {

    List<Status> findAll();
    void initializeValues();
    Status createStatus(Status status);
    Status updateStatus(Long id, Status status);
    void deleteStatus(Long id);
    Status findById(Long id);
    Status getStatus(Long id);
}