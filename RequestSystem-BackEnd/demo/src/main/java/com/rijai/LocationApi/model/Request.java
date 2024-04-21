package com.rijai.LocationApi.model;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="requests")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requestId;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToMany
    @JoinTable(
        name = "request_employee",
        joinColumns = @JoinColumn(name = "request_id"),
        inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private Set<Employee> employees;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateCreated;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateModified;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateResolved;
    @ManyToOne
    @JoinColumn(name = "advisingtype_id")
    private AdvisingType advisingType;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subjects subject;
    private String description;
    private String actionTaken;
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name = "formtype_id")    
    private FormType formType;
    @ManyToOne
    @JoinColumn(name = "priority_id")
    private Priority priority;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    

}