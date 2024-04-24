package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.UserRoles;
import com.rijai.LocationApi.repository.UserRolesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class UserRolesService implements IUserRolesService {
    @Autowired
    private UserRolesRepository userRolesRepository;
    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void initializeValues(){
        if (userRolesRepository.count() == 0) {
            List<String> userRoleNames = Arrays.asList("ADMINISTRATION","PROFESSOR","STUDENT");
            Long counter = 1L;
            for (String name : userRoleNames) {
                UserRoles userRole = new UserRoles(counter, name); 
                userRolesRepository.save(userRole);
                counter++;
            }
        }
    }

    public List<UserRoles> findAll() {
        return (List<UserRoles>) userRolesRepository.findAll();
    }

    @Override
    public UserRoles getRole(Long id) {
        Optional<UserRoles> optional=userRolesRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (UserRoles) optional.get();
    }

    @Override
    public UserRoles createRole(UserRoles roles) {
        return userRolesRepository.save(roles);
    }

    public UserRoles updateRole(Long id, UserRoles roles) {
        return userRolesRepository.save(roles);
    }

    public UserRoles findById(Long id) {
        Optional<UserRoles> roles = userRolesRepository.findById(id);
        return roles.orElse(null);
    }

    public void deleteRole (Long id) {
        Optional<UserRoles> roles = userRolesRepository.findById(id);
        roles.ifPresent(value -> userRolesRepository.delete(value));
    }
}
