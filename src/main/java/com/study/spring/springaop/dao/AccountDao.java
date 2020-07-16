package com.study.spring.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

    public void addAccount() {
        System.out.println(getClass() + " adding my account");
    }

    public void updateAccount() {
        System.out.println(getClass() + " updating account");
    }

    public String deleteAccount() {
        System.out.println(getClass() + " account is deleted.. ");
        return "hello";
    }
}
