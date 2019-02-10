package com.rkoneru.sample.entity;

public class EmployeeObjectMother {

    public static Employee create() {
        Employee employee = new Employee();
        employee.setId(123L);
        return employee;
    }
}