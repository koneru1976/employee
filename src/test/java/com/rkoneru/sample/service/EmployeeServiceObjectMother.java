package com.rkoneru.sample.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.rkoneru.sample.config.ModelMapperConfiguration;
import com.rkoneru.sample.entity.EmployeeObjectMother;
import com.rkoneru.sample.repository.EmployeeRepository;

public class EmployeeServiceObjectMother {

    public static EmployeeService create() {
        EmployeeRepository mockEmployeeRepository = mock(EmployeeRepository.class);
        when(mockEmployeeRepository.findById(123L)).thenReturn(Optional.of(EmployeeObjectMother.create()));
        return new EmployeeService(mockEmployeeRepository, new ModelMapperConfiguration().modelMapper());
    }
}