package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Student;
import com.rijai.LocationApi.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    @PostMapping("/api/add-student")
    public Student addStudent (@RequestPart MultipartFile photoBytes,@ModelAttribute Student student){
        try {
            // Convert MultipartFile to byte array
            byte[] photoTest = photoBytes.getBytes();
            
            // Set the byte array to the student's photo field
            student.setPhoto(photoTest);
        } catch (IOException e) {
            // Handle exception
            e.printStackTrace();
        }
        
        // // Save the student object with photo
        return studentService.createStudent(student);
    }

    @PutMapping("/api/update-student/{id}")
    public Student updateStudent(@PathVariable Long id, @ModelAttribute Student student) {
        // try {
        //     // Convert MultipartFile to byte array
        //     byte[] photoBytes = photo.getBytes();
            
        //     // Set the byte array to the student's photo field
        //     student.setPhoto(photoBytes);
        // } catch (IOException e) {
        //     // Handle exception
        //     e.printStackTrace();
        // }
        
        // // Save the student object with photo
        return studentService.updateStudent(id,student);
    }
    @DeleteMapping("/api/delete-student/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

}
