package com.rijai.LocationApi.model;

import javax.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requestId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToMany
    @JoinTable(
        name = "request_employee",
        joinColumns = @JoinColumn(name = "request_id"),
        inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private Set<Employee> employees;

    private String title;
    private Date dateCreated;
    private Date dateModified;
    private Date dateResolved;
    private String advisingType;
    private String subject;
    private String description;
    private String actionTaken;
    private String priority;
    private String status;
    
    public Request(){
        
    }

    public Request(Long requestId, Student student, Set<Employee> employees, String title, Date dateCreated,
            Date dateModified, Date dateResolved, String advisingType, String subject, String description,
            String actionTaken, String priority, String status) {
        this.requestId = requestId;
        this.student = student;
        this.employees = employees;
        this.title = title;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.dateResolved = dateResolved;
        this.advisingType = advisingType;
        this.subject = subject;
        this.description = description;
        this.actionTaken = actionTaken;
        this.priority = priority;
        this.status = status;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDateResolved() {
        return dateResolved;
    }

    public void setDateResolved(Date dateResolved) {
        this.dateResolved = dateResolved;
    }

    public String getAdvisingType() {
        return advisingType;
    }

    public void setAdvisingType(String advisingType) {
        this.advisingType = advisingType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((requestId == null) ? 0 : requestId.hashCode());
        result = prime * result + ((student == null) ? 0 : student.hashCode());
        result = prime * result + ((employees == null) ? 0 : employees.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
        result = prime * result + ((dateModified == null) ? 0 : dateModified.hashCode());
        result = prime * result + ((dateResolved == null) ? 0 : dateResolved.hashCode());
        result = prime * result + ((advisingType == null) ? 0 : advisingType.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((actionTaken == null) ? 0 : actionTaken.hashCode());
        result = prime * result + ((priority == null) ? 0 : priority.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        Request other = (Request) obj;
        if (requestId == null) {
            if (other.requestId != null)
                return false;
        } else if (!requestId.equals(other.requestId))
            return false;
        if (student == null) {
            if (other.student != null)
                return false;
        } else if (!student.equals(other.student))
            return false;
        if (employees == null) {
            if (other.employees != null)
                return false;
        } else if (!employees.equals(other.employees))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (dateCreated == null) {
            if (other.dateCreated != null)
                return false;
        } else if (!dateCreated.equals(other.dateCreated))
            return false;
        if (dateModified == null) {
            if (other.dateModified != null)
                return false;
        } else if (!dateModified.equals(other.dateModified))
            return false;
        if (dateResolved == null) {
            if (other.dateResolved != null)
                return false;
        } else if (!dateResolved.equals(other.dateResolved))
            return false;
        if (advisingType == null) {
            if (other.advisingType != null)
                return false;
        } else if (!advisingType.equals(other.advisingType))
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (actionTaken == null) {
            if (other.actionTaken != null)
                return false;
        } else if (!actionTaken.equals(other.actionTaken))
            return false;
        if (priority == null) {
            if (other.priority != null)
                return false;
        } else if (!priority.equals(other.priority))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Request [requestId=" + requestId + ", student=" + student + ", employees=" + employees + ", title="
                + title + ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + ", dateResolved="
                + dateResolved + ", advisingType=" + advisingType + ", subject=" + subject + ", description="
                + description + ", actionTaken=" + actionTaken + ", priority=" + priority + ", status=" + status + "]";
    }




}