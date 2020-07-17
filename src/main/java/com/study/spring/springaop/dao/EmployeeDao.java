package com.study.spring.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addEmployee() {
        System.out.println(getClass() + " Adding Employee");
    }

    public void processEmployee() {
        System.out.println(getClass() + " Processing employee");
    }
}
