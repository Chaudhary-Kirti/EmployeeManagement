package com.EmployeeManagementSystem.EmployeeManagement.repository;

import com.EmployeeManagementSystem.EmployeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByName(String name);

    Employee findByEmail(String email);
}
