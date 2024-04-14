package com.rijai.LocationApi.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;
    private String studentID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String program;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    private int yearLevel;
    private String email;
    private String gender;
    @Lob
    private byte[] photo;



}