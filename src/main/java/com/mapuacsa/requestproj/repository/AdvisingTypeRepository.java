package com.mapuacsa.requestproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapuacsa.requestproj.model.AdvisingType;

@Repository
public interface AdvisingTypeRepository extends JpaRepository<AdvisingType, Long>{
    
}
