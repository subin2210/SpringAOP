package com.study.spring.springaop;

import com.study.spring.springaop.configuration.SpringAopAdvice;
import com.study.spring.springaop.service.FortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class MainApplicationAroundAdvice {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringAopAdvice.class);

        Logger logger = Logger.getLogger(MainApplicationAroundAdvice.class.getName());
        try {
            FortuneService fortuneService = applicationContext.getBean("fortuneService", FortuneService.class);
            logger.info("Calling fortune service...");
            logger.info(fortuneService.getFortune());

            logger.info("Finding best route...");
            logger.info(fortuneService.isRoadOpen(true));
        } finally {
            applicationContext.close();
        }
    }
}
