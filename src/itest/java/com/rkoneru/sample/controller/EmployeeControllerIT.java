package com.rkoneru.sample.controller;

import static org.junit.Assert.assertEquals;

import com.rkoneru.sample.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class EmployeeControllerIT {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnEmployee() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employees/123");
        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();

        assertEquals("{\"id\":123}", mvcResult.getResponse().getContentAsString());
    }
}
