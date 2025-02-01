package com.simpleApi.restApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpleApi.restApi.entity.Department;
import com.simpleApi.restApi.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Long id){
        departmentRepository.deleteById(id);
    }

    @Override
    public Department getDepartment(Long id){
        return departmentRepository.findById(id).get();
    }

    @Override
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department department, Long id){
        Department curr = departmentRepository.findById(id).get();
        if(department.getDepartmentName() != null){
            curr.setDepartmentName(department.getDepartmentName());
        }
        if(department.getDepartmentAddress() != null){
            curr.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(department.getDepartmentCode() != null){
            curr.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepository.save(curr);
    }

    @Override
    public List<Department> getDepartmentByName(String departmentName){
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }

}
