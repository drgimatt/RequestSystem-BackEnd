package com.mapuacsa.requestproj.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapuacsa.requestproj.model.FormType;
import com.mapuacsa.requestproj.repository.FormTypeRepository;

@Service
public class FormTypeService implements IFormTypeService{
    @Autowired
    private FormTypeRepository formTypeRepository;

    @PostConstruct
    public void initializeValues(){
        if (formTypeRepository.count() == 0) {
            List<String> formTypeNames = Arrays.asList("Peer Advising at W501-Intramuros / R203-Makati","Career Advising at Center for Career Services","Counseling of Personal Concerns at Center for Guidance Counseling","Others");
            int id = 1;
            for (String name : formTypeNames) {
                FormType formType = new FormType((long) id++, name);
                formTypeRepository.save(formType);
            }
        }
    }

    @Override
    public List<FormType> findAll() {
        return formTypeRepository.findAll();
    }

    @Override
    public FormType createFormType(FormType formtype) {
        return formTypeRepository.save(formtype);
    }

    @Override
    public FormType updateFormType(Long id, FormType formtype) {
        Optional<FormType> existingFormType = formTypeRepository.findById(id);
        if(existingFormType.isPresent()) {
            return formTypeRepository.save(formtype);
        }
        else
            return null;
    }

    @Override
    public void deleteFormType(Long id) {
        formTypeRepository.deleteById(id);
    }

    @Override
    public FormType findById(Long id) {
        Optional<FormType> formtype = formTypeRepository.findById(id);
        return formtype.orElse(null);
    }

    @Override
    public FormType getFormType(Long id) {
        Optional<FormType> optional=formTypeRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (FormType) optional.get();
    }

}
