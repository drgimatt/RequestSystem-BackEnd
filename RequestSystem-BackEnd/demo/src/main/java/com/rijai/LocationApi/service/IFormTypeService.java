package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.FormType;
import java.util.List;


public interface IFormTypeService {

    List<FormType> findAll();
    void initializeValues();
    FormType createFormType(FormType formtype);
    FormType updateFormType(Long id, FormType formtype);
    void deleteFormType(Long id);
    FormType findById(Long id);
    FormType getFormType(Long id);
}