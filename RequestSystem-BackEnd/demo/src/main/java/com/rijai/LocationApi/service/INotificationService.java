package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Notification;
import java.util.List;


public interface INotificationService {

    List<Notification> findAll();
    Notification createNotification(Notification notification);
    Notification updateNotification(Long id, Notification notification);
    void deleteNotification(Long id);
    Notification findById(Long id);
    Notification getNotification(Long id);
}