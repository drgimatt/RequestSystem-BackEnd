package com.mapuacsa.requestproj.service;

import com.mapuacsa.requestproj.model.UserRoles;

import java.util.List;


public interface IUserRolesService {

    List<UserRoles> findAll();
    void initializeValues();
    UserRoles createRole(UserRoles roles);
    UserRoles updateRole(Long id, UserRoles roles);
    void deleteRole(Long id);
    UserRoles findById(Long id);
    UserRoles getRole(Long id);
}