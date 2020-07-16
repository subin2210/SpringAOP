package com.study.spring.springaop.dao;

import com.study.spring.springaop.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

    public void addStudent(Student student){
        System.out.println(getClass() + "Student is added..." + student.getFirstName());
    }

    public void updateStudent(Student student, boolean pass) {
        System.out.println("Updating the passed student");
    }
}
