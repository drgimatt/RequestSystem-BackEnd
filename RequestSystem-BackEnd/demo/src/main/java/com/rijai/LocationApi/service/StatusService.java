package com.rijai.LocationApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rijai.LocationApi.model.Status;
import com.rijai.LocationApi.repository.StatusRepository;

@Service
public class StatusService implements IStatusService{
    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<Status> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public Status createStatus(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public Status updateStatus(Long id, Status status) {
        Optional<Status> existingStatus = statusRepository.findById(id);
        if(existingStatus.isPresent()) {
            return statusRepository.save(status);
        }
        else
            return null;
    }

    @Override
    public void deleteStatus(Long id) {
        statusRepository.deleteById(id);
    }

    @Override
    public Status findById(Long id) {
        Optional<Status> status = statusRepository.findById(id);
        return status.orElse(null);
    }

    @Override
    public Status getStatus(Long id) {
        Optional<Status> optional=statusRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Status) optional.get();
    }

}
