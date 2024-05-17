package com.mapuacsa.requestproj.service;

import com.mapuacsa.requestproj.model.Student;

import java.util.List;


public interface IStudentService {

    List<Student> getStudents();
    //Student doesStudentExist(String username, String password);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
    Student findById(Long id);
    Student getStudent(Long id);
}