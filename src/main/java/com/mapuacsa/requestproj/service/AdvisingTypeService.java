package com.mapuacsa.requestproj.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapuacsa.requestproj.model.AdvisingType;
import com.mapuacsa.requestproj.repository.AdvisingTypeRepository;

@Service
public class AdvisingTypeService implements IAdvisingTypeService{
    @Autowired
    private AdvisingTypeRepository typeRepository;

    @PostConstruct
    public void initializeValues() {
        if (typeRepository.count() == 0) {
            List<String> typeNames = Arrays.asList("Thesis/Design Subject concerns", "Requirements in Course Enrolled",
                    "Mentoring / Clarification on the Topic of the Subjects Enrolled",
                    "Concerns about Electives / Track in the Curriculum", "Concerns on Internship / OJT Matters",
                    "Concerns regarding Placement / Employment Opportunities", "Concerns regarding Personal / Family",
                    "Others");
    
            for (int i = 0; i < typeNames.size(); i++) {
                AdvisingType type = new AdvisingType();
                type.setId((long) (i + 1)); // Explicitly set the ID
                type.setName(typeNames.get(i));
                typeRepository.save(type);
            }
        }
    }
    


    @Override
    public List<AdvisingType> findAll() {
        return typeRepository.findAll();
    }

    @Override
    public AdvisingType createAdvisingType(AdvisingType type) {
        return typeRepository.save(type);
    }

    @Override
    public AdvisingType updateAdvisingType(Long id, AdvisingType type) {
        Optional<AdvisingType> existingAdvisingType = typeRepository.findById(id);
        if(existingAdvisingType.isPresent()) {
            return typeRepository.save(type);
        }
        else
            return null;
    }

    @Override
    public void deleteAdvisingType(Long id) {
        typeRepository.deleteById(id);
    }

    @Override
    public AdvisingType findById(Long id) {
        Optional<AdvisingType> type = typeRepository.findById(id);
        return type.orElse(null);
    }

    @Override
    public AdvisingType getAdvisingType(Long id) {
        Optional<AdvisingType> optional=typeRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (AdvisingType) optional.get();
    }

}
