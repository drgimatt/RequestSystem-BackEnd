package com.mapuacsa.requestproj.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="students")
@EqualsAndHashCode(callSuper = true)
public class Student extends Person{

    private String studentID;
    private String program;
    private int yearLevel;

}