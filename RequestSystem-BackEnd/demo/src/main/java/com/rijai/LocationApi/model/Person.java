package com.rijai.LocationApi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@SuperBuilder(toBuilder = true)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;    
    @Lob
    private byte[] photo;  
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String gender;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    
    // public Person() {
    // }

    // public Person(Long userId, byte[] photo, String firstName, String middleName, String lastName, String email,
    //         String gender, Department department) {
    //     this.userId = userId;
    //     this.photo = photo;
    //     this.firstName = firstName;
    //     this.middleName = middleName;
    //     this.lastName = lastName;
    //     this.email = email;
    //     this.gender = gender;
    //     this.department = department;
    // }
}
