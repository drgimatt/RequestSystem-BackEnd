package com.mapuacsa.requestproj.model;

import java.util.Date;



import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;
    private String userID;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateCreated;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    private String phoneNumber;
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn (name = "role_id")
    private UserRoles role;


    
}