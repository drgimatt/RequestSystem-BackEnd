package com.mapuacsa.requestproj.service;

import com.mapuacsa.requestproj.model.Request;
import com.mapuacsa.requestproj.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class RequestService implements IRequestService {
    @Autowired
    private RequestRepository requestRepository;    
    @PersistenceContext
    private EntityManager em;

    public List<Request> getRequests() {
        return (List<Request>) requestRepository.findAll();
    }


    public List<Request> getProfessorRequests(String employeeID) {
        TypedQuery<Request> query = em.createQuery("SELECT r FROM Request r JOIN r.subject s JOIN s.employees e WHERE e.employeeID = :employeeid", Request.class);
        query.setParameter("employeeid", employeeID);

        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public Request getRequest(Long id) {
        Optional<Request> optional=requestRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Request) optional.get();
    }

    @Override
    public Request createRequest(Request request) {
        return requestRepository.save(request);
    }

    public Request updateRequest(Long id, Request request) {
        return requestRepository.save(request);
    }

    public void deleteRequest (Long id) {
        Optional<Request> request = requestRepository.findById(id);
        request.ifPresent(value -> requestRepository.delete(value));
    }


    @Override
    public List<Request> getGeneralizedRequests(String arguments) {
        TypedQuery<Request> query = em.createQuery(arguments, Request.class);
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }
}
