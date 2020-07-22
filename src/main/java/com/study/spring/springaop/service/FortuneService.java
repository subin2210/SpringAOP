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

    public String isRoadOpen(boolean wireIn) {
        if(wireIn)
            throw new  RuntimeException("There a major accident!!! Road is closed");
        return "Yes,, the road is open. You are good to Go!!!";
    }
}
