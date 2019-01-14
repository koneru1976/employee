package com.rkoneru.sample.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.rkoneru.sample.config.ModelMapperConfiguration;
import com.rkoneru.sample.entity.EmployeeObjectMother;
import com.rkoneru.sample.model.Employee;
import com.rkoneru.sample.repository.EmployeeRepository;
import org.junit.Test;
import org.modelmapper.ModelMapper;

public class EmployeeServiceTest {

    private EmployeeRepository mockEmployeeRepository = mock(EmployeeRepository.class);
    private ModelMapper modelMapper = new ModelMapperConfiguration().modelMapper();

    private EmployeeService employeeService = new EmployeeService(mockEmployeeRepository, modelMapper);


    @Test
    public void shouldReturnEmployeeWithId123() {
        when(mockEmployeeRepository.getOne(123L)).thenReturn(EmployeeObjectMother.create());

        Employee employee = employeeService.getById(123L);

        assertEquals(123L, employee.getId().longValue());
    }
}