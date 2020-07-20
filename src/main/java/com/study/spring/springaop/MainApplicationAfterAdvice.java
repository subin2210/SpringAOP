package com.study.spring.springaop;

import com.study.spring.springaop.configuration.SpringAopAdvice;
import com.study.spring.springaop.dao.AccountDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplicationAfterAdvice {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(SpringAopAdvice.class);

        try {
            AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);
            accountDao.deleteAccount(false);
        } catch (Exception exception) {
            System.out.println("Exception in catch block = " + exception.getMessage());
        } finally {
            applicationContext.close();
        }
    }
}
