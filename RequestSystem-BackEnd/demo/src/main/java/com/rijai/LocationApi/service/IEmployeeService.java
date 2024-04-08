package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Employee;

import java.util.List;


public interface IEmployeeService {

    List<Employee> getEmployees();
    //Employee doesEmployeeExist(String username, String password);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    Employee findById(Long id);
    Employee getEmployee(Long id);
}