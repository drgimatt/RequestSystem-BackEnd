package com.rijai.LocationApi.model;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
