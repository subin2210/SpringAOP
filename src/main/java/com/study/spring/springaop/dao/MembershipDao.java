package com.study.spring.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

    public void addAccount() {
        System.out.println(getClass() + " adding my membership account");
    }

    public void updateAccount() {
        System.out.println(getClass() + " update member");
    }

    public void deleteMember() {
        System.out.println(getClass() + " member is deleted...");
    }
}
