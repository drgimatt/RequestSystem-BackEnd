package com.rijai.LocationApi.model;

import java.util.Set;

import javax.persistence.*;

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
@Table(name="employees")
public class Employee extends Person {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // private Long id; 
    private String employeeID;
    private String position;
    @ManyToMany
    @JoinTable(
            name = "employee_subjects",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "subjects_id")
    )
    private Set<Subjects> subjects;

    // public Employee (Long userId, byte[] photo, String firstName, String middleName, String lastName, String email, String gender, Department department, String employeeID, String position, Set<Subjects> subjects){
    //     super(userId, photo, firstName, middleName, lastName, email, gender, department);
    //     this.employeeID = employeeID;
    //     this.position = position;
    //     this.subjects = subjects;
    // }
}