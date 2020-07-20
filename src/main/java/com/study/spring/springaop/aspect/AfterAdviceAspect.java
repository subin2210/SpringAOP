package com.study.spring.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAdviceAspect {

    @After("execution(* com.study.spring.springaop.dao.AccountDao.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method caught in after account advice = " + methodSignature);
        System.out.println("Log after account - advice- @Finally");
    }
}
