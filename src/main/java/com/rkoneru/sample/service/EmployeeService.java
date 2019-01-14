package com.rkoneru.sample.service;

import com.rkoneru.sample.model.Employee;
import com.rkoneru.sample.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public Employee getById(Long employeeId) {
        com.rkoneru.sample.entity.Employee employeeEntity = employeeRepository.getOne(employeeId);
        return modelMapper.map(employeeEntity, Employee.EmployeeBuilder.class).build();
    }
}
