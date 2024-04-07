package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.UserRoles;
import com.rijai.LocationApi.repository.UserRolesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class UserRolesService implements IUserRolesService {
    @Autowired
    private UserRolesRepository userRolesRepository;
    @PersistenceContext
    private EntityManager em;

    /*public UserRoles doesRoleExist(String role) {
        TypedQuery<Account> query = em.createQuery("SELECT roleName FROM Account u WHERE u.roleName = :role", UserRoles.class);
        query.setParameter("username", username);
        query.setParameter("password", password);

        try {
            return query.getSingleResult();
        } catch (NoResultException | NonUniqueResultException e) {
            return null;
        }
    } */

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
