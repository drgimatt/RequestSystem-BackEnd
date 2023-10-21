package com.rijai.LocationApi.model;

import javax.persistence.*;
import java.util.Objects;
import java.sql.Date;

@Entity
@Table(name="dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String photo;
    private String name;
    private String breed;
    private int age;
    private Date doa;
    private String personality;

    public Dog() {
    }

    public Dog(Long id, String photo, String name, String breed, int age, Date doa, String personality) {
        this.id = id;
        this.photo = photo;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.doa = doa;
        this.personality = personality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDoa() {
        return doa;
    }

    public void setDoa(Date doa) {
        this.doa = doa;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.photo);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.breed);
        hash = 79 * hash + Objects.hashCode(this.age);
        hash = 79 * hash + Objects.hashCode(this.doa);
        hash = 79 * hash + Objects.hashCode(this.personality);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.photo, other.photo)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.breed, other.breed)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.doa, other.doa)) {
            return false;
        }
        if (!Objects.equals(this.personality, other.personality)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", photo='").append(photo).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append(", age (in months)=").append(age);
        sb.append(", date of arrival=").append(doa);
        sb.append(", personality=").append(personality);
        sb.append('}');
        return sb.toString();
    }

}