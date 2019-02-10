package com.rkoneru.sample.controller;

import static org.springframework.http.HttpStatus.OK;

import com.rkoneru.sample.model.Employee;
import com.rkoneru.sample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees/{employee-id}")
    public ResponseEntity<Employee> get(@PathVariable("employee-id") Long employeeId) {
        Employee employee = employeeService.getById(employeeId);
        return new ResponseEntity<>(employee, OK);
    }
}
