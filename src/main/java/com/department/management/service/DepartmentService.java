package com.department.management.service;

import com.department.management.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department product);

    // Read operation
    Department getDepartment(Long departmentId);

    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department, Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
