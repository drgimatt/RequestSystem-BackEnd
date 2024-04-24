package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.AdvisingType;

import java.util.List;


public interface IAdvisingTypeService {

    List<AdvisingType> findAll();
    void initializeValues();
    AdvisingType createAdvisingType(AdvisingType type);
    AdvisingType updateAdvisingType(Long id, AdvisingType type);
    void deleteAdvisingType(Long id);
    AdvisingType findById(Long id);
    AdvisingType getAdvisingType(Long id);
}