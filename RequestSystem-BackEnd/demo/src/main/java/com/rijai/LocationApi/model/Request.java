package com.rijai.LocationApi.model;

import javax.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;
    private String studentID;
    private String professorID;
    private String title;
    private Date dateCreated;
    private Date dateModified;
    private Date dateResolved;
    private String advisingType;
    private String subject;
    private String description;
    private String priority;
    private String status;




}