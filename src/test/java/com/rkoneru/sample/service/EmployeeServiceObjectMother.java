package com.rkoneru.sample.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.rkoneru.sample.config.ModelMapperConfiguration;
import com.rkoneru.sample.entity.EmployeeObjectMother;
import com.rkoneru.sample.repository.EmployeeRepository;

public class EmployeeServiceObjectMother {

    public static EmployeeService create() {
        EmployeeRepository mockEmployeeRepository = mock(EmployeeRepository.class);
        when(mockEmployeeRepository.getOne(123L)).thenReturn(EmployeeObjectMother.create());
        return new EmployeeService(mockEmployeeRepository, new ModelMapperConfiguration().modelMapper());
    }
}