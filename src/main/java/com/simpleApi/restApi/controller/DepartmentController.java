package com.simpleApi.restApi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.simpleApi.restApi.entity.Department;
import com.simpleApi.restApi.service.DepartmentService;

import jakarta.validation.Valid;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }
    
    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable Long id){
        departmentService.deleteDepartment(id);
        return "Department deleted successfully";
    }
    
    @GetMapping("/department/{id}")
    public Department getDepartment(@PathVariable Long id){
        return departmentService.getDepartment(id);
    }
    
    @GetMapping("/department")
    public List<Department> getAllDepartments(){
        LOGGER.info("Inside getAllDepartments of DepartmentController");
        return departmentService.getAllDepartments();
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable Long id){
        return departmentService.updateDepartment(department, id);
    }
    
    @GetMapping("/department/name/{departmentName}")
    public List<Department> getDepartmentByName(@PathVariable String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }
}
