package com.mapuacsa.requestproj.controller;

import com.mapuacsa.requestproj.model.Student;
import com.mapuacsa.requestproj.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class StudentController {
    @Autowired
    private IStudentService studentService;
    
    @RequestMapping("/api/students")
    public List<Student> findStudents(){
       return studentService.getStudents();
    }

    @RequestMapping("/api/show-student/{id}")
    public Student showStudent(@PathVariable Long id) {
       return studentService.getStudent(id);
    }

    @PostMapping("/api/add-student/")
    public Student addStudent (@ModelAttribute Student student){
        return studentService.createStudent(student);
    }

    @PutMapping("/api/update-student/{id}")
    public Student updateStudent(@PathVariable Long id, @ModelAttribute Student student) {
        return studentService.updateStudent(id,student);
    }
    @DeleteMapping("/api/delete-student/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

}
