package com.rijai.LocationApi.model;

import javax.persistence.*;

import java.util.Arrays;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;
    private String studentID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String program;
    private int yearLevel;
    private String email;
    private String gender;
    @Lob
    private byte[] photo;

    public Student() {
    }

    public Student(Long myId, String studentID, String firstName, String middleName, String lastName, String program,
            int yearLevel, String email, String gender, byte[] photo) {
        this.myId = myId;
        this.studentID = studentID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.program = program;
        this.yearLevel = yearLevel;
        this.email = email;
        this.gender = gender;
        this.photo = photo;
    }



    public Long getMyId() {
        return myId;
    }

    public void setMyId(Long myId) {
        this.myId = myId;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((myId == null) ? 0 : myId.hashCode());
        result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((program == null) ? 0 : program.hashCode());
        result = prime * result + yearLevel;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + Arrays.hashCode(photo);
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
        Student other = (Student) obj;
        if (myId == null) {
            if (other.myId != null)
                return false;
        } else if (!myId.equals(other.myId))
            return false;
        if (studentID == null) {
            if (other.studentID != null)
                return false;
        } else if (!studentID.equals(other.studentID))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (middleName == null) {
            if (other.middleName != null)
                return false;
        } else if (!middleName.equals(other.middleName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (program == null) {
            if (other.program != null)
                return false;
        } else if (!program.equals(other.program))
            return false;
        if (yearLevel != other.yearLevel)
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        if (!Arrays.equals(photo, other.photo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [myId=" + myId + ", studentID=" + studentID + ", firstName=" + firstName + ", middleName="
                + middleName + ", lastName=" + lastName + ", program=" + program + ", yearLevel=" + yearLevel
                + ", email=" + email + ", gender=" + gender + ", photo=" + Arrays.toString(photo) + "]";
    }





}