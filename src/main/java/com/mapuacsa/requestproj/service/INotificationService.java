package com.mapuacsa.requestproj.service;

import com.mapuacsa.requestproj.model.Notification;
import java.util.List;


public interface INotificationService {

    List<Notification> findAll();
    Notification createNotification(Notification notification);
    Notification updateNotification(Long id, Notification notification);
    void deleteNotification(Long id);
    Notification findById(Long id);
    Notification getNotification(Long id);
    List<Notification> getUserNotifications(String id);
    List<Notification> getGeneralizedNotifications(String arguments);
}