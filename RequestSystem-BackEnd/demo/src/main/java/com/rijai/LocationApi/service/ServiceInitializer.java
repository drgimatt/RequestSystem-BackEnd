package com.rijai.LocationApi.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rijai.LocationApi.model.Department;
import com.rijai.LocationApi.model.Priority;
import com.rijai.LocationApi.model.Status;
import com.rijai.LocationApi.model.Student;
import com.rijai.LocationApi.model.UserRoles;
import com.rijai.LocationApi.repository.DepartmentRepository;
import com.rijai.LocationApi.repository.PriorityRepository;
import com.rijai.LocationApi.repository.StatusRepository;
import com.rijai.LocationApi.repository.StudentRepository;
import com.rijai.LocationApi.repository.UserRolesRepository;

@Service
public class ServiceInitializer {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private PriorityRepository priorityRepository;

    @Autowired
    private StatusRepository statusRepository; 

    @Autowired
    private UserRolesRepository userRolesRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    // @PostConstruct
    // public void initializeValues(){

    //     if (priorityRepository.count() == 0) {
    //         List<String> priorityNames = Arrays.asList("Low", "Moderate", "High");
    //         Long counter = 1L;
    //         for (String name : priorityNames) {
    //             Priority priority = new Priority(counter, name); 
    //             priorityRepository.save(priority);
    //             counter++;
    //         }
    //     }

    //     if (statusRepository.count() == 0) {
    //         List<String> statusNames = Arrays.asList("COMPLETED","PENDING","REJECTED");
    //         Long counter = 1L;
    //         for (String name : statusNames) {
    //             Status status = new Status(counter, name); 
    //             statusRepository.save(status);
    //             counter++;
    //         }
    //     }

    //     if (userRolesRepository.count() == 0) {
    //         List<String> userRoleNames = Arrays.asList("ADMINISTRATION","PROFESSOR","STUDENT");
    //         Long counter = 1L;
    //         for (String name : userRoleNames) {
    //             UserRoles userRole = new UserRoles(counter, name); 
    //             userRolesRepository.save(userRole);
    //             counter++;
    //         }
    //     }

    //     // if (departmentRepository.count() == 0) {
    //     //     List<String> departmentNames = Arrays.asList("ADMINISTRATION","PROFESSOR","STUDENT");
    //     //     Long counter = 1L;
    //     //     for (String name : departmentNames) {
    //     //         Department department = new Department(counter, name); 
    //     //         departmentRepository.save(department);
    //     //         counter++;
    //     //     }
    //     // }        

    //     if (studentRepository.count() == 0) {

    //         List<String> firstNames = Arrays.asList("Miguel", "Maiko", "Joshua Gabriel");
    //         List<String> middleNames = Arrays.asList("Santos", "Moiko", "Sempura");
    //         List<String> lastNames = Arrays.asList("Escandor", "Manrique", "Umali");
    //         List<String> genders = Arrays.asList("Male", "Female", "Male");
    //         List<String> departments = Arrays.asList("1", "2", "3");
    //         List<String> programs = Arrays.asList("Computer Science", "Broadcast Media", "Biomedical Engineer");
    //         List<String> studentids = Arrays.asList("202101378", "202200001", "202323456");
    //         List<String> yearLevels = Arrays.asList("3", "2", "1");
    //         List<String> emails = Arrays.asList("msescandor@mymail.mapua.edu.ph", "mmmanrique@mymail.mapua.edu.ph", "jgsumali@mymail.mapua.edu.ph");

    //         Date dateAdded = new Date();


    //         Long counter = 1L;
    //         for (int i = 0; i < firstNames.size(); i++) {
    //             Student student = new Student();
    //             student.setMyId(counter);
    //             student.setFirstName(firstNames.get(i)); 
    //             student.setMiddleName(middleNames.get(i));
    //             student.setLastName(lastNames.get(i));
    //             student.setGender(genders.get(i));
    //             student.setDepartment(departments.get(i));
    //             studentRepository.save(student);
    //             counter++;

    //         }
    //     }


    // }


    
}
