package com.study.spring.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityAspect {
    @Before("com.study.spring.springaop.aspect.LogAscpect.beforeEmployeeNoGetterNoSetter()")
    public void securityCheck() {
        System.out.println("security check + executing before method");
    }
}
