package com.rijai.LocationApi.repository;

import com.rijai.LocationApi.model.Subjects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends CrudRepository <Subjects, Long> {
}
