package com.department.management.service;

import java.util.List;
import java.util.Objects;

import com.department.management.entity.Department;
import com.department.management.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  // Save operation
  @Override
  public Department saveDepartment(Department department) {
    return departmentRepository.save(department);
  }

  @Override
  public Department getDepartment(Long departmentId) {
    return departmentRepository.findById(departmentId).get();
  }

  // Read operation
  @Override
  public List<Department> fetchDepartmentList() {
    return (List<Department>) departmentRepository.findAll();
  }

  // Update operation
  @Override
  public Department updateDepartment(Department department, Long departmentId) {
    Department depDB = departmentRepository.findById(departmentId).get();

    if (Objects.nonNull(department.getDepartmentName())
        && !"".equalsIgnoreCase(department.getDepartmentName())) {
      depDB.setDepartmentName(department.getDepartmentName());
    }

    if (Objects.nonNull(department.getDepartmentAddress())
        && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
      depDB.setDepartmentAddress(department.getDepartmentAddress());
    }

    if (Objects.nonNull(department.getDepartmentCode())
        && !"".equalsIgnoreCase(department.getDepartmentCode())) {
      depDB.setDepartmentCode(department.getDepartmentCode());
    }

    return departmentRepository.save(depDB);
  }

  // Delete operation
  @Override
  public void deleteDepartmentById(Long departmentId) {
    departmentRepository.deleteById(departmentId);
  }
}
