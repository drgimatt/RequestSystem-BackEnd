package com.mapuacsa.requestproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapuacsa.requestproj.model.FormType;

@Repository
public interface FormTypeRepository extends JpaRepository<FormType, Long>{
    
}
