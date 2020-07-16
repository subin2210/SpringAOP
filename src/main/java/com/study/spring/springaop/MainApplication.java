package com.study.spring.springaop;

import com.study.spring.springaop.configuration.SpringAopBeforeAdvice;
import com.study.spring.springaop.dao.AccountDao;
import com.study.spring.springaop.dao.MembershipDao;
import com.study.spring.springaop.dao.StudentDao;
import com.study.spring.springaop.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringAopBeforeAdvice.class);

        try {
            //Before execution AspectJ
            AccountDao accountDao = applicationContext.getBean("accountDao",AccountDao.class);

            accountDao.addAccount();
            accountDao.updateAccount();
            accountDao.deleteAccount();

            MembershipDao membershipDao = applicationContext.getBean("membershipDao",MembershipDao.class);

            membershipDao.addAccount();
            membershipDao.updateAccount();
            membershipDao.deleteMember();

            //Before execution AspectJ with objects
            StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);
            Student student = new Student("John", "Subin");
            studentDao.addStudent(student);
            studentDao.updateStudent(student,true);
        } finally {
            applicationContext.close();
        }
    }
}
