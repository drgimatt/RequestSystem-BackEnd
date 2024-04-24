package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Priority;

import java.util.List;


public interface IPriorityService {

    List<Priority> findAll();
    void initializeValues();
    Priority createPriority(Priority priority);
    Priority updatePriority(Long id, Priority priority);
    void deletePriority(Long id);
    Priority findById(Long id);
    Priority getPriority(Long id);
}