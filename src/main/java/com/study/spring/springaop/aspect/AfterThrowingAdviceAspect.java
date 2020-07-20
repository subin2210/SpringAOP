package com.study.spring.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterThrowingAdviceAspect {

    @AfterThrowing (
            pointcut = "execution(* com.study.spring.springaop.dao.AccountDao.*(..))",
            throwing = "exec"
    )
    public void afterThrowingAdvice(JoinPoint joinPoint, Throwable exec) {
        System.out.println("Execution after throwing advice ==" + exec);
    }
}
