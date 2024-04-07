package com.rijai.LocationApi.model;

import java.util.Set;

import javax.persistence.*;




@Entity
@Table(name="subjects")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long myId;    
    private String courseCode;
    private String name;
    @OneToMany(mappedBy = "subjects") 
    private Set<Employee> employees;

    public Subjects(){

    }

    public Subjects(Long myId, String courseCode, String name, Set<Employee> employees) {
        this.myId = myId;
        this.courseCode = courseCode;
        this.name = name;
        this.employees = employees;
    }

    public Long getMyId() {
        return myId;
    }

    public void setMyId(Long myId) {
        this.myId = myId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((myId == null) ? 0 : myId.hashCode());
        result = prime * result + ((courseCode == null) ? 0 : courseCode.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((employees == null) ? 0 : employees.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Subjects other = (Subjects) obj;
        if (myId == null) {
            if (other.myId != null)
                return false;
        } else if (!myId.equals(other.myId))
            return false;
        if (courseCode == null) {
            if (other.courseCode != null)
                return false;
        } else if (!courseCode.equals(other.courseCode))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (employees == null) {
            if (other.employees != null)
                return false;
        } else if (!employees.equals(other.employees))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Subjects [myId=" + myId + ", courseCode=" + courseCode + ", name=" + name + ", employees=" + employees
                + "]";
    }

    
    
}