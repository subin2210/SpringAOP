package com.study.spring.springaop.dao;

import com.study.spring.springaop.entity.Employee;
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

    public void addEmployee(Employee employee) {
        System.out.println(getClass() + " Adding Employee..." + employee.getFirstName());
    }

    public void processEmployee() {
        System.out.println(getClass() + " Processing employee");
    }
}
