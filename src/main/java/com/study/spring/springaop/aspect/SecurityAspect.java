package com.study.spring.springaop.aspect;

import com.study.spring.springaop.entity.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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

    @Before("com.study.spring.springaop.aspect.LogAscpect.beforeEmployeeNoGetterNoSetter()")
    public void instrumentMethod(JoinPoint joinPoint) {

        System.out.println("Experimenting joinpoint");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method = "+ methodSignature);

        Object[] objects = joinPoint.getArgs();
        for(Object object : objects) {
            System.out.println(object);

            if(object instanceof Employee) {
                Employee employee = (Employee)object;
                System.out.println("Employee name is.. " + employee.getFirstName() + " " + employee.getLastName());
            }
        }
    }
}
