package com.rkoneru.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeApplicationIT {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void shouldLoadApplicationContext() {
        assertNotNull(applicationContext);
    }
}
