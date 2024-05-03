package com.rijai.LocationApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rijai.LocationApi.model.Notification;
import com.rijai.LocationApi.repository.NotificationRepository;

@Service
public class NotificationService implements INotificationService{
    @Autowired
    private NotificationRepository notificationRepository;


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

}