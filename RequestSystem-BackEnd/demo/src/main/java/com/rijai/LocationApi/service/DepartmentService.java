package com.rijai.LocationApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rijai.LocationApi.model.Department;
import com.rijai.LocationApi.repository.DepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Optional<Department> existingDepartment = departmentRepository.findById(id);
        if(existingDepartment.isPresent()) {
            return departmentRepository.save(department);
        }
        else
            return null;
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department findById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.orElse(null);
    }

    @Override
    public Department getDepartment(Long id) {
        Optional<Department> optional=departmentRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Department) optional.get();
    }

}
