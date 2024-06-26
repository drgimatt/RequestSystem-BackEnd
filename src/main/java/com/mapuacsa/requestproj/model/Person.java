package com.mapuacsa.requestproj.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;    
    @Lob
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateAdded;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    
}
