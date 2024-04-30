package com.rijai.LocationApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rijai.LocationApi.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{
    
}
