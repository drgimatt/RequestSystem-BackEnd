package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Subjects;
import com.rijai.LocationApi.repository.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class SubjectsService implements ISubjectsService {
    @Autowired
    private SubjectsRepository subjectsRepository;
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

    public List<Subjects> findAll() {
        return (List<Subjects>) subjectsRepository.findAll();
    }

    @Override
    public Subjects getSubject(Long id) {
        Optional<Subjects> optional=subjectsRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Subjects) optional.get();
    }

    @Override
    public Subjects createSubject(Subjects subject) {
        // System.out.println("TARANTADO "+ subject);
        // System.out.println("POTA " + subject.getEmployees().get(0).getMyId());
        return subjectsRepository.save(subject);
    }

    public Subjects updateSubject(Long id, Subjects subject) {
        return subjectsRepository.save(subject);
    }

    public Subjects findById(Long id) {
        Optional<Subjects> subject = subjectsRepository.findById(id);
        return subject.orElse(null);
    }

    public void deleteSubject (Long id) {
        Optional<Subjects> subject = subjectsRepository.findById(id);
        subject.ifPresent(value -> subjectsRepository.delete(value));
    }
}
