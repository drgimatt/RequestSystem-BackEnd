package com.mapuacsa.requestproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapuacsa.requestproj.model.Priority;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long>{
    
}
