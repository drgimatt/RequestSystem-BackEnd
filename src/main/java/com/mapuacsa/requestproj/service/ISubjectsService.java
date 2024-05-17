package com.mapuacsa.requestproj.service;

import com.mapuacsa.requestproj.model.Subjects;

import java.util.List;


public interface ISubjectsService {

    List<Subjects> findAll();
    //UserRoles doesRoleExist(String role);
    Subjects createSubject(Subjects subject);
    Subjects updateSubject(Long id, Subjects subject);
    void deleteSubject(Long id);
    Subjects findById(Long id);
    Subjects getSubject(Long id);
}