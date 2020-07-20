package com.study.spring.springaop;

import com.study.spring.springaop.configuration.SpringAopAdvice;
import com.study.spring.springaop.dao.AccountDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplicationAfterReturningAdvice {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(SpringAopAdvice.class);
        try {
            AccountDao accountDao = applicationContext.getBean("accountDao",AccountDao.class);
            System.out.println("Finding account directly");
            System.out.println("After returning advice....\n" + accountDao.findAccounts());
            //Note: The above sys out will execute after after returning advice execute
        } finally {
            applicationContext.close();
        }
    }
}
