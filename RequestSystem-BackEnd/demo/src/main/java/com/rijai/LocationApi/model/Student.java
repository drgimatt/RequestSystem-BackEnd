package com.rijai.LocationApi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

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