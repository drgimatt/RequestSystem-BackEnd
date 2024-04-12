package com.rijai.LocationApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rijai.LocationApi.model.Priority;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long>{
    
}
