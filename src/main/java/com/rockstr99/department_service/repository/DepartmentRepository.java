package com.rockstr99.department_service.repository;

import com.rockstr99.department_service.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    private List<Department> departmentList = new ArrayList<>();

    public Boolean addDepartment(Department department) {
        if (department != null) return departmentList.add(department);
        return false;
    }

    public Department findById(Long id) {
        return departmentList
                .stream()
                .filter(department -> department.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    public List<Department> getAllDepartments(){
        return departmentList;
    }


}
