package com.rijai.LocationApi.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Entity
@Data
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;
    private String userID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateCreated;
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn (name = "role_id")
    private UserRoles role;


    
}