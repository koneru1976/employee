package com.rkoneru.sample.controller;

import static org.junit.Assert.assertEquals;

import com.rkoneru.sample.model.Employee;
import com.rkoneru.sample.service.EmployeeServiceObjectMother;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

public class EmployeeControllerTest {

    private ResponseEntity<Employee> responseEntity;

    private EmployeeController employeeController = new EmployeeController(EmployeeServiceObjectMother.create());

    @Before
    public void setUp() {
        responseEntity = employeeController.getEmployeeById(123L);
    }

    @Test
    public void shouldReturnResponseEntityWith200StatusCode() {
        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void shouldReturnResponseEntityWithEmployeeId123() {
        Employee employee = responseEntity.getBody();
        assertEquals(123L, employee.getId().longValue());
    }
}