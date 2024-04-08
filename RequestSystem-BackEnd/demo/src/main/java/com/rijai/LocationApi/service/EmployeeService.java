package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Employee;
import com.rijai.LocationApi.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getEmployees() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> existingEmployee = repository.findById(id);
        if(existingEmployee.isPresent()) {
            return repository.save(employee);
        }
        else
            return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> employee = repository.findById(id);
        if(employee.isPresent()) {
            repository.delete(employee.get());
        }
    }

    @Override
    public Employee findById(Long id) {
        Optional<Employee> employee = repository.findById(id);
        return employee.orElse(null);
    }

    @Override
    public Employee getEmployee(Long id) {
        Optional<Employee> optional=repository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Employee) optional.get();
    }    

}
