package com.mapuacsa.requestproj.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapuacsa.requestproj.model.Priority;
import com.mapuacsa.requestproj.repository.PriorityRepository;

@Service
public class PriorityService implements IPriorityService{
    @Autowired
    private PriorityRepository priorityRepository;

    @PostConstruct
    public void initializeValues(){
        if (priorityRepository.count() == 0) {
            List<String> priorityNames = Arrays.asList("Low", "Moderate", "High");
            Long counter = 1L;
            for (String name : priorityNames) {
                Priority priority = new Priority(counter, name); 
                priorityRepository.save(priority);
                counter++;
            }
        }
    }

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
