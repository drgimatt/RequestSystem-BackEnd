package com.rijai.LocationApi.model;

import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;    
    @Lob
    private byte[] photo;
    private String employeeID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String position;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    private String email;
    private String gender;
    
    @ManyToMany
    @JoinTable(
            name = "employee_subjects",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "subjects_id")
    )
    private Set<Subjects> subjects;

    // public Employee() {
    // }

    // public Employee(Long myId, byte[] photo, String employeeID, String firstName, String middleName, String lastName,
    //         String position, String department, String email, String gender, Set<Subjects> subjects) {
    //     this.myId = myId;
    //     this.photo = photo;
    //     this.employeeID = employeeID;
    //     this.firstName = firstName;
    //     this.middleName = middleName;
    //     this.lastName = lastName;
    //     this.position = position;
    //     this.department = department;
    //     this.email = email;
    //     this.gender = gender;
    //     this.subjects = subjects;
    // }

    // public Long getMyId() {
    //     return myId;
    // }

    // public void setMyId(Long myId) {
    //     this.myId = myId;
    // }

    // public byte[] getPhoto() {
    //     return photo;
    // }

    // public void setPhoto(byte[] photo) {
    //     this.photo = photo;
    // }

    // public String getEmployeeID() {
    //     return employeeID;
    // }

    // public void setEmployeeID(String employeeID) {
    //     this.employeeID = employeeID;
    // }

    // public String getFirstName() {
    //     return firstName;
    // }

    // public void setFirstName(String firstName) {
    //     this.firstName = firstName;
    // }

    // public String getMiddleName() {
    //     return middleName;
    // }

    // public void setMiddleName(String middleName) {
    //     this.middleName = middleName;
    // }

    // public String getLastName() {
    //     return lastName;
    // }

    // public void setLastName(String lastName) {
    //     this.lastName = lastName;
    // }

    // public String getPosition() {
    //     return position;
    // }

    // public void setPosition(String position) {
    //     this.position = position;
    // }

    // public String getDepartment() {
    //     return department;
    // }

    // public void setDepartment(String department) {
    //     this.department = department;
    // }

    // public String getEmail() {
    //     return email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    // public String getGender() {
    //     return gender;
    // }

    // public void setGender(String gender) {
    //     this.gender = gender;
    // }

    // public Set<Subjects> getSubjects() {
    //     return subjects;
    // }

    // public void setSubjects(Set<Subjects> subjects) {
    //     this.subjects = subjects;
    // }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((myId == null) ? 0 : myId.hashCode());
    //     result = prime * result + Arrays.hashCode(photo);
    //     result = prime * result + ((employeeID == null) ? 0 : employeeID.hashCode());
    //     result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    //     result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
    //     result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
    //     result = prime * result + ((position == null) ? 0 : position.hashCode());
    //     result = prime * result + ((department == null) ? 0 : department.hashCode());
    //     result = prime * result + ((email == null) ? 0 : email.hashCode());
    //     result = prime * result + ((gender == null) ? 0 : gender.hashCode());
    //     result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Employee other = (Employee) obj;
    //     if (myId == null) {
    //         if (other.myId != null)
    //             return false;
    //     } else if (!myId.equals(other.myId))
    //         return false;
    //     if (!Arrays.equals(photo, other.photo))
    //         return false;
    //     if (employeeID == null) {
    //         if (other.employeeID != null)
    //             return false;
    //     } else if (!employeeID.equals(other.employeeID))
    //         return false;
    //     if (firstName == null) {
    //         if (other.firstName != null)
    //             return false;
    //     } else if (!firstName.equals(other.firstName))
    //         return false;
    //     if (middleName == null) {
    //         if (other.middleName != null)
    //             return false;
    //     } else if (!middleName.equals(other.middleName))
    //         return false;
    //     if (lastName == null) {
    //         if (other.lastName != null)
    //             return false;
    //     } else if (!lastName.equals(other.lastName))
    //         return false;
    //     if (position == null) {
    //         if (other.position != null)
    //             return false;
    //     } else if (!position.equals(other.position))
    //         return false;
    //     if (department == null) {
    //         if (other.department != null)
    //             return false;
    //     } else if (!department.equals(other.department))
    //         return false;
    //     if (email == null) {
    //         if (other.email != null)
    //             return false;
    //     } else if (!email.equals(other.email))
    //         return false;
    //     if (gender == null) {
    //         if (other.gender != null)
    //             return false;
    //     } else if (!gender.equals(other.gender))
    //         return false;
    //     if (subjects == null) {
    //         if (other.subjects != null)
    //             return false;
    //     } else if (!subjects.equals(other.subjects))
    //         return false;
    //     return true;
    // }

    // @Override
    // public String toString() {
    //     return "Employee [myId=" + myId + ", photo=" + Arrays.toString(photo) + ", employeeID=" + employeeID
    //             + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", position="
    //             + position + ", department=" + department + ", email=" + email + ", gender=" + gender + ", subjects="
    //             + subjects + "]";
    // }
    
    

}