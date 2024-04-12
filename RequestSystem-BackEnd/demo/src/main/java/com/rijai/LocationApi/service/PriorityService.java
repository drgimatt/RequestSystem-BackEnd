package com.rijai.LocationApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rijai.LocationApi.model.Priority;
import com.rijai.LocationApi.repository.PriorityRepository;

@Service
public class PriorityService implements IPriorityService{
    @Autowired
    private PriorityRepository priorityRepository;

    @Override
    public List<Priority> findAll() {
        return priorityRepository.findAll();
    }

    @Override
    public Priority createPriority(Priority priority) {
        return priorityRepository.save(priority);
    }

    @Override
    public Priority updatePriority(Long id, Priority priority) {
        Optional<Priority> existingPriority = priorityRepository.findById(id);
        if(existingPriority.isPresent()) {
            return priorityRepository.save(priority);
        }
        else
            return null;
    }

    @Override
    public void deletePriority(Long id) {
        priorityRepository.deleteById(id);
    }

    @Override
    public Priority findById(Long id) {
        Optional<Priority> priority = priorityRepository.findById(id);
        return priority.orElse(null);
    }

    @Override
    public Priority getPriority(Long id) {
        Optional<Priority> optional=priorityRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Priority) optional.get();
    }

}
