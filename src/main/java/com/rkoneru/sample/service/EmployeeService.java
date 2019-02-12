package com.rkoneru.sample.service;

import java.util.Optional;

import com.rkoneru.sample.model.Employee;
import com.rkoneru.sample.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public Employee getById(Long employeeId) {
        Optional<com.rkoneru.sample.entity.Employee> optionalEmployee = employeeRepository.findById(employeeId);
        logger.info("Employee retrieved from database {}", optionalEmployee.isPresent() ? optionalEmployee.get() : null);
        return modelMapper.map(optionalEmployee.get(), Employee.builder().getClass()).build();
    }
}
