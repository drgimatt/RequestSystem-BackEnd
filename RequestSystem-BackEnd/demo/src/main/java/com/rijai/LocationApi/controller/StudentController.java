package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Student;
import com.rijai.LocationApi.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    
    public List<Student> findStudents(){
       return studentService.getStudents();
    }

    @RequestMapping("/show-student/{id}")
    public Student showStudent(@PathVariable Long id) {
       return studentService.getStudent(id);
    }

    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping("/update-student/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }
    @DeleteMapping("/delete-student/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

}
