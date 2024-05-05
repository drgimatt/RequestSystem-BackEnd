package com.rijai.LocationApi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

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

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "person_notifications",
            joinColumns = @JoinColumn(name = "notifications_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private List<Person> notifyPersons;

    @ManyToOne
    @Nullable
    @JoinColumn(name = "event_user_id")
    private Person eventUser;

    @ManyToOne
    @Nullable
    @JoinColumn(name = "request_id")
    private Request request;

}






