package com.mapuacsa.requestproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapuacsa.requestproj.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{
    
}
