package com.rijai.LocationApi.model;

import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees")
public class Employee extends Person {

    private String employeeID;
    private String position;


}