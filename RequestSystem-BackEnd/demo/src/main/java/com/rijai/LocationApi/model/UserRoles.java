package com.rijai.LocationApi.model;

import javax.persistence.*;
import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Transactional
@EqualsAndHashCode
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myId;    
    private String roleName;

    @PrePersist
    public void initializeValues() {
        // Set initial values for myId and roleName
        if (myId == null) {
            myId = 1L; // Start from 1
        }
        
        if (roleName == null) {
            // Initialize roleName based on myId
            switch (myId.intValue()) {
                case 1:
                    roleName = "ADMINISTRATION";
                    break;
                case 2:
                    roleName = "PROFESSOR";
                    break;
                case 3:
                    roleName = "STUDENT";
                    break;
                default:
                    roleName = ""; // Default role name if myId is not in the predefined range
            }
        }
    }
}