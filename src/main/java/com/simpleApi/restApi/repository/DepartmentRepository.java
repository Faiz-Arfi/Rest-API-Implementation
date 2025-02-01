package com.simpleApi.restApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpleApi.restApi.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

    Department findByDepartmentName (String departmentName);

    List<Department> findByDepartmentNameIgnoreCase (String departmentName);
}
