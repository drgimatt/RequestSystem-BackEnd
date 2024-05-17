package com.mapuacsa.requestproj.repository;

import com.mapuacsa.requestproj.model.Subjects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends JpaRepository <Subjects, Long> {
}
