package com.rijai.LocationApi.model;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees")
public class Employee extends Person {

    private String employeeID;
    private String position;
    @JsonIgnore
    @ManyToMany(mappedBy = "employees")
    private List<Subjects> subjects;

}