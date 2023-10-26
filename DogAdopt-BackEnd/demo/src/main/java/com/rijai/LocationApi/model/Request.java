package com.rijai.LocationApi.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long reqId;
    @ManyToOne
    @JoinColumn(name = "dogId", referencedColumnName = "id")
    private Dog dog;
    private String reqName;
    private String reqContact;
    private String reqMessage;

    public Request() {
    }

    public Request(Long reqId, Dog dog, String reqName, String reqContact, String reqMessage) {
        this.reqId = reqId;
        this.dog = dog;
        this.reqName = reqName;
        this.reqContact = reqContact;
        this.reqMessage = reqMessage;
    }

    public Long getReqId() {
        return reqId;
    }

    public void setReqId(Long reqId) {
        this.reqId = reqId;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public String getReqContact() {
        return reqContact;
    }

    public void setReqContact(String reqContact) {
        this.reqContact = reqContact;
    }

    public String getReqMessage() {
        return reqMessage;
    }

    public void setReqMessage(String reqMessage) {
        this.reqMessage = reqMessage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.reqId);
        hash = 79 * hash + Objects.hashCode(this.dog);
        hash = 79 * hash + Objects.hashCode(this.reqName);
        hash = 79 * hash + Objects.hashCode(this.reqContact);
        hash = 79 * hash + Objects.hashCode(this.reqMessage);
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
        final Request other = (Request) obj;
        if (!Objects.equals(this.reqMessage, other.reqMessage)) {
            return false;
        }
        if (!Objects.equals(this.reqContact, other.reqContact)) {
            return false;
        }
        if (!Objects.equals(this.reqName, other.reqName)) {
            return false;
        }
        if (!Objects.equals(this.dog, other.dog)) {
            return false;
        }
        return Objects.equals(this.reqId, other.reqId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Request {");
        sb.append("id=").append(reqId);
        sb.append(", dog=").append(dog != null ? dog.getId() : "null");
        sb.append(", name='").append(reqName).append('\'');
        sb.append(", contact='").append(reqContact).append('\'');
        sb.append(", message=").append(reqMessage);
        sb.append('}');
        return sb.toString();
    }

}