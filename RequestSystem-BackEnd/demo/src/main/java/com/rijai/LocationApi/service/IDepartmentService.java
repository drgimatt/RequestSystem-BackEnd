package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Department;

import java.util.List;


public interface IDepartmentService {

    List<Department> findAll();
    //Department doesDepartmentExist(String department);
    Department createDepartment(Department department);
    Department updateDepartment(Long id, Department department);
    void deleteDepartment(Long id);
    Department findById(Long id);
    Department getDepartment(Long id);
}