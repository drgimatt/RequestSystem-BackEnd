package com.rijai.LocationApi.model;

import javax.persistence.*;

import lombok.Data;


@Entity
@Data
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
    private String dateCreated;
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn (name = "role_id")
    private UserRoles role;


    
}