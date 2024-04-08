package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Student;

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