package com.rijai.LocationApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rijai.LocationApi.model.AdvisingType;

@Repository
public interface AdvisingTypeRepository extends JpaRepository<AdvisingType, Long>{
    
}
