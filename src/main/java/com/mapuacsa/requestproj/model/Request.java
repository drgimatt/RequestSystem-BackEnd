package com.mapuacsa.requestproj.model;

import jakarta.persistence.*;

//import org.hibernate.envers.Audited;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
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
    @Column(columnDefinition = "DATETIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateCreated;
    @Column(columnDefinition = "DATETIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateModified;
    @Column(columnDefinition = "DATETIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateResolved;
    @ManyToOne
    @JoinColumn(name = "advisingtype_id")
    private AdvisingType advisingType;
    private String otherAdvisingType;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subjects subject;
    private String description;
    private String actionTaken;
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name = "formtype_id")    
    private FormType formType;
    private String otherFormType;
    @ManyToOne
    @JoinColumn(name = "priority_id")
    private Priority priority;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    private Boolean isDeleted;

}