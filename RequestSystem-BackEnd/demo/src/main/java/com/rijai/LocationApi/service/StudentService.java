package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Student;
import com.rijai.LocationApi.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> getStudents() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Optional<Student> existingStudent = repository.findById(id);
        if(existingStudent.isPresent()) {
            return repository.save(student);
        }
        else
            return null;
    }

    @Override
    public void deleteStudent(Long id) {
        Optional<Student> student = repository.findById(id);
        if(student.isPresent()) {
            repository.delete(student.get());
        }
    }

    @Override
    public Student findById(Long id) {
        Optional<Student> student = repository.findById(id);
        return student.orElse(null);
    }

    @Override
    public Student getStudent(Long id) {
        Optional<Student> optional=repository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Student) optional.get();
    }    

}
