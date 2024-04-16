package com.rijai.LocationApi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

// @ToString
// @EqualsAndHashCode(callSuper = true)
// @Entity
// @Getter
// @SuperBuilder(toBuilder = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="students")
public class Student extends Person{
    // @Id
    // //@GeneratedValue(strategy = GenerationType.AUTO)
    // private Long id; 
    private String studentID;
    private String program;
    private int yearLevel;

    // public Student (Long userId, byte[] photo, String firstName, String middleName, String lastName, String email, String gender, Department department, String studentID, String program, int yearLevel){
    //     super(userId, photo, firstName, middleName, lastName, email, gender, department);
    //     this.studentID = studentID;
    //     this.program = program;
    //     this.yearLevel = yearLevel;
    // }
}