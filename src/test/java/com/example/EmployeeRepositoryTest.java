package com.example;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository repository;

    @Test
    public void test() throws Exception {

        Employee employee = new Employee();
        employee.setName("test");
        employee.setEmail("test@example.com");
        repository.save(employee);

        Assert.assertThat(repository.findAll().size(), Matchers.is(2));

    }
}
