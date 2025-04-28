package via.doc1.repository.spring_boot_docker_app1.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import via.doc1.repository.spring_boot_docker_app1.model.Department;
import via.doc1.repository.spring_boot_docker_app1.repository.DepartmentRepository;

import org.springframework.stereotype.Service;

@Service

public class DepartmentService {
@Autowired
    DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }
}