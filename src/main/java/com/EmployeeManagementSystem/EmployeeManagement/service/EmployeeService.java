package com.EmployeeManagementSystem.EmployeeManagement.service;


import com.EmployeeManagementSystem.EmployeeManagement.entity.Employee;
import com.EmployeeManagementSystem.EmployeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee){

          return employeeRepository.save(employee);

    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee getEmployeeByName(String name){
        return employeeRepository.findByName(name);
    }

    public Employee getEmployeeByEmail(String email){
        return employeeRepository.findByEmail(email);
    }

    public Employee updateSalary(int id, Employee updatedSalary) {
        return employeeRepository.findById(id)
                .map(employee -> { employee.setSalary(updatedSalary.getSalary());
                    return employeeRepository.save(employee);
                })
                .orElseThrow(() -> new RuntimeException("Employee Not Found" + id));
    }

    public String deleteEmployee(int id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "Employee details deleted";
        } else {
            throw new RuntimeException("Employee Not Found" + id);
        }
    }




}
