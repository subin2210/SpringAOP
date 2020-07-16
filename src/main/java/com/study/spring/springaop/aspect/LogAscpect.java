package com.study.spring.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAscpect {

    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("Executing before add account advise");
    }

    @Before("execution(public void update*())")
    public void beforeUpdate() {
        System.out.println("Executing before update advise......");
    }

    @Before("execution(* delete*())")
    public void beforeDelete() {
        System.out.println("Executing before delete advise..");
    }
}
