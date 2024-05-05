package com.rijai.LocationApi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name="notifications")
@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String message;
    private String eventType;
    private int hasSeenNotif;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "notify_person_id")
    private Person notifyUser;

    @ManyToOne
    @JoinColumn(name = "event_person_id")
    private Person eventUser;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private Request request;

}






