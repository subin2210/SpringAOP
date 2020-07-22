package com.study.spring.springaop;

import com.study.spring.springaop.configuration.SpringAopAdvice;
import com.study.spring.springaop.service.FortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplicationAroundAdvice {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringAopAdvice.class);
        try {
            FortuneService fortuneService = applicationContext.getBean("fortuneService", FortuneService.class);
            System.out.println("Calling fortune service...");
            System.out.println(fortuneService.getFortune());
        } finally {
            applicationContext.close();
        }
    }
}
