package com.mapuacsa.requestproj.service;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapuacsa.requestproj.model.Notification;
import com.mapuacsa.requestproj.repository.NotificationRepository;

@Service
public class NotificationService implements INotificationService{
    @Autowired
    private NotificationRepository notificationRepository;
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Notification> findAll() {
        return notificationRepository.findAll();
    }

    @Override
    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public Notification updateNotification(Long id, Notification notification) {
        Optional<Notification> existingNotification = notificationRepository.findById(id);
        if(existingNotification.isPresent()) {
            return notificationRepository.save(notification);
        }
        else
            return null;
    }

    @Override
    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }

    @Override
    public Notification findById(Long id) {
        Optional<Notification> notification = notificationRepository.findById(id);
        return notification.orElse(null);
    }

    @Override
    public Notification getNotification(Long id) {
        Optional<Notification> optional = notificationRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Notification) optional.get();
    }

    @Override
    public List<Notification> getUserNotifications(String id) {
        TypedQuery<Notification> query = em.createQuery("SELECT n FROM Notification n JOIN n.notifyPersons e WHERE e.employeeID = :userid", Notification.class);
        query.setParameter("userid", id);

        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Notification> getGeneralizedNotifications(String arguments) {
        TypedQuery<Notification> query = em.createQuery(arguments, Notification.class);
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    

}
