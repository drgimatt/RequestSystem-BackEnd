package com.mapuacsa.requestproj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;



@Entity
@Table(name="formtype")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class FormType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
