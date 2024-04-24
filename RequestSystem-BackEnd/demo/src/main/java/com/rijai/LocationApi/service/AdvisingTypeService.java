package com.rijai.LocationApi.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rijai.LocationApi.model.AdvisingType;
import com.rijai.LocationApi.repository.AdvisingTypeRepository;

@Service
public class AdvisingTypeService implements IAdvisingTypeService{
    @Autowired
    private AdvisingTypeRepository typeRepository;

    @PostConstruct
    public void initializeValues(){
        if (typeRepository.count() == 0) {
            List<String> typeNames = Arrays.asList("Thesis/Design Subject concerns","Requirements in Course Enrolled","Mentoring / Clarification on the Topic of the Subjects Enrolled",
            "Concerns about Electives / Track in the Curriculum", "Concerns on Internship / OJT Matters", "Concerns regarding Placement / Employment Opportunities",
            "Concerns regarding Personal / Family", "Others");
            Long counter = 1L;
            for (String name : typeNames) {
                AdvisingType type = new AdvisingType(counter, name); 
                typeRepository.save(type);
                counter++;
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
