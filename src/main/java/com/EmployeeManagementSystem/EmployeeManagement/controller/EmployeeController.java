package com.EmployeeManagementSystem.EmployeeManagement.controller;


import com.EmployeeManagementSystem.EmployeeManagement.entity.Employee;
import com.EmployeeManagementSystem.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/id/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/name/{name}")
    public Employee getEmployeeByName(@PathVariable("name") String name){
        return employeeService.getEmployeeByName(name);
    }

    @GetMapping("/email/{email}")
    public Employee getEmployeeByEmail(@PathVariable String email){
        return employeeService.getEmployeeByEmail(email);
    }

    @PutMapping("/{id}")
    public Employee updateSalary(@PathVariable int id, @RequestBody Employee updatedSalary){
        return employeeService.updateSalary(id, updatedSalary);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }
}
