package com.mapuacsa.requestproj.repository;

import com.mapuacsa.requestproj.model.UserRoles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends JpaRepository <UserRoles, Long> {
}
