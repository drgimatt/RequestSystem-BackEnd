package com.rijai.LocationApi.repository;

import com.rijai.LocationApi.model.Subjects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends JpaRepository <Subjects, Long> {
}
