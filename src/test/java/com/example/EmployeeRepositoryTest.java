package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@Transactional
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository repository;

    @Test
    public void test() throws Exception {
        Employee employee = new Employee();
        employee.setName("test");
        employee.setEmail("test@example.com");
        repository.save(employee);

        assertThat(repository.findAll().size(), is(1));
    }

    @Test
    public void test2() throws Exception {
        assertThat(10, is(10));
    }
}
