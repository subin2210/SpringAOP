package com.study.spring.springaop.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class FortuneService {

    public String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        return "You have a good day today..";
    }
}
