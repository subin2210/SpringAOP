package com.study.spring.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAscpect {

    // Point cut expression matching the exact method signature
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("Executing before add account advise");
    }

    //Point cut expression matching any method start with update.."
    @Before("execution(public void update*())")
    public void beforeUpdate() {
        System.out.println("Executing before update advise......");
    }

    //Point cut expression for any return type and method starting with delete.."
    @Before("execution(* delete*())")
    public void beforeDelete() {
        System.out.println("Executing before delete advise..");
    }

    //Point cut expression to method name starting with add*
    @Before("execution(public void add*(..))")
    public void beforeAddAdvice() {
        System.out.println("Executing before any add advise");
    }

    //Point cut expression for exact method signature and parameter
    //Note : Must use fully qualified class name
    @Before("execution(public void addStudent(com.study.spring.springaop.entity.Student))")
    public void beforeAddWithObjects() {
        System.out.println("Executing before Add student....");
    }

    //Point cut expression for any method name staring with update and having one specified object
    // and having n number of other arguments
//    public void updateStudent(Student student,
    @Before("execution(public void update*(com.study.spring.springaop.entity.Student,..))")
    public void beforeUpdateWithOneSpecifArgument() {
        System.out.println("Executing before method starting with update and student object, " +
                "+ having n number of other objects");
    }
}
