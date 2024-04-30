package com.rijai.LocationApi.model;

import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="subjects")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;    
    private String courseCode;
    private String name;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "employee_subjects",
            joinColumns = @JoinColumn(name = "subjects_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private List<Employee> employees;


}