package com.rkoneru.sample.entity;

public class EmployeeObjectMother {

    public static Employee create() {
        return Employee.builder().id(123L).build();
    }
}