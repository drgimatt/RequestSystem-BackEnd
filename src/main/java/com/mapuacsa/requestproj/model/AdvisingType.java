package com.mapuacsa.requestproj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="advisingtype")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class AdvisingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
