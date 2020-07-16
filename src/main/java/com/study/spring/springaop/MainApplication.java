package com.study.spring.springaop;

import com.study.spring.springaop.configuration.SpringAopBeforeAdvice;
import com.study.spring.springaop.dao.AccountDao;
import com.study.spring.springaop.dao.MembershipDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringAopBeforeAdvice.class);

        AccountDao accountDao = applicationContext.getBean("accountDao",AccountDao.class);

        accountDao.addAccount();
        accountDao.updateAccount();
        accountDao.deleteAccount();

        MembershipDao membershipDao = applicationContext.getBean("membershipDao",MembershipDao.class);

        membershipDao.addAccount();
        membershipDao.updateAccount();
        membershipDao.deleteMember();

        applicationContext.close();
    }
}
