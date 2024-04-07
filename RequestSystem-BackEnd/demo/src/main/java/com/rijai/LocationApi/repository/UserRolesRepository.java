package com.rijai.LocationApi.repository;

import com.rijai.LocationApi.model.UserRoles;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends CrudRepository <UserRoles, Long> {
}