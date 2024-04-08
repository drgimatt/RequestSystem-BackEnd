package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Employee;
import com.rijai.LocationApi.service.IEmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    
    public List<Employee> findEmployees(){
       return employeeService.getEmployees();
    }

    @RequestMapping("/show-employee/{id}")
    public Employee showEmployee(@PathVariable Long id) {
       return employeeService.getEmployee(id);
    }

    @PostMapping("/add-employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/update-employee/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }
    @DeleteMapping("/delete-employee/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

}
