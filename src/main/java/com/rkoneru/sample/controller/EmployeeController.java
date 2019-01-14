package com.rkoneru.sample.controller;

import static org.springframework.http.HttpStatus.OK;

import com.rkoneru.sample.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{employee-id}")
    public ResponseEntity<Employee> get(@PathVariable("employee-id") Long employeeId) {
        return new ResponseEntity<>(Employee.builder().id(employeeId).build(), OK);
    }
}
