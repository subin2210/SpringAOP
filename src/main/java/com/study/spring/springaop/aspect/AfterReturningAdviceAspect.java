package com.study.spring.springaop.aspect;

import com.study.spring.springaop.entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AfterReturningAdviceAspect {

    @AfterReturning(
            pointcut = "execution(* com.study.spring.springaop.dao.AccountDao.find*(..))",
            returning = "result"
    )
    public void afterReturningFindAccountAdvice(JoinPoint joinPoint, List<Account> result) {

        System.out.println("After returning advice aspect");
        System.out.println("Method signature is..."+ joinPoint.getSignature());

        System.out.println("Return result is.." + result);

        for(Account account : result) {
            account.setName(account.getName().toUpperCase());
        }
    }
}
