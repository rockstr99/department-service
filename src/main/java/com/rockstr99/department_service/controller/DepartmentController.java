package com.rockstr99.department_service.controller;

import com.rockstr99.department_service.model.Department;
import com.rockstr99.department_service.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping
    public Department addNewDepartment(@RequestBody Department dept) {
        LOGGER.info("Add new department: {}", dept);
        if (departmentRepository.addDepartment(dept)) return dept;
        else return null;
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        LOGGER.info("get All departments");

        return departmentRepository.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        LOGGER.info("find department by id : {}", id);

        return departmentRepository.findById(id);
    }

}
