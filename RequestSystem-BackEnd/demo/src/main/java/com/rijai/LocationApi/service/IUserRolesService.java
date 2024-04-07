package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.UserRoles;

import java.util.List;


public interface IUserRolesService {

    List<UserRoles> findAll();
    //UserRoles doesRoleExist(String role);
    UserRoles createRole(UserRoles roles);
    UserRoles updateRole(Long id, UserRoles roles);
    void deleteRole(Long id);
    UserRoles findById(Long id);
    UserRoles getRole(Long id);
}