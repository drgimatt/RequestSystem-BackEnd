package com.rijai.LocationApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rijai.LocationApi.model.Notification;
import com.rijai.LocationApi.service.INotificationService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class NotificationController {
    @Autowired
    private INotificationService notificationService;

    @PostMapping("/api/create-notification")
    public Notification createNotification(@ModelAttribute Notification notification) {
        return notificationService.createNotification(notification);
    }

    @GetMapping("/api/notifications")
    public List<Notification> showAllNotifications() {
        return notificationService.findAll();
    }

    @GetMapping("/api/show-notification/{id}")
    public Notification showNotification(@PathVariable Long id) {
        return notificationService.findById(id);
    }

    @PutMapping("/api/update-notification/{id}")
    public Notification updateNotification(@PathVariable Long id, @ModelAttribute Notification notification) {
        return notificationService.updateNotification(id, notification);
    }
    @DeleteMapping("/api/delete-notification/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotification(id);
    }
    
    @GetMapping("/api/notifications/{id}")
    public List<Notification> getUserNotification(@PathVariable Long id) {
        return notificationService.getUserNotifications(id.toString());
    }

    @GetMapping("/api/notifications-generalized/{arguments}")
    public List<Notification> getGeneralNotification(@PathVariable String arguments) {
        return notificationService.getGeneralizedNotifications(arguments);
    }
}
