package com.simpleApi.restApi.service;

import java.util.List;

import com.simpleApi.restApi.entity.Department;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public void deleteDepartment(Long id);

    public Department getDepartment(Long id);

    public List<Department> getAllDepartments();

    public Department updateDepartment(Department department, Long id);

    public List<Department> getDepartmentByName(String departmentName);

}
