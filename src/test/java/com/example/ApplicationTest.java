package com.example;


import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationTest {

    @Autowired
    EmployeeRepository repository;

    @Before
    public void initialize() {
        System.out.println("INIT!!!!!!!!!!!!");
        repository.deleteAll();
    }

}
