package com.mapuacsa.requestproj.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long myId;    
    private String roleName;

}