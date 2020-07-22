package com.study.spring.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class AroundAdviceAspect {
    
    private Logger logger = Logger.getLogger(getClass().getName());

    @Around("execution(* com.study.spring.springaop.service.FortuneService.*(..))")
    public Object findPerformanceAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable{

        MethodSignature methodSignature = (MethodSignature)proceedingJoinPoint.getSignature();

        logger.info("Method call = "+methodSignature.getName());

        long start = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        logger.info("Method execution time = "+ (end-start)/1000);
        return result;
    }
}
