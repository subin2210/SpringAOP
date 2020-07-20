package com.study.spring.springaop.dao;

import com.study.spring.springaop.entity.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    public List<Account> findAccounts() {
        List<Account> accounts = new ArrayList<Account>();
        Account account = new Account("John","Savings");
        Account account1 = new Account("Subin","Current");
        Account account2 = new Account("Abc","Savings");
        Account account3 = new Account("Def","Currnt");
        accounts.add(account);
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        return accounts;
    }

    public void searchAccount() {
        if(true)
            throw new RuntimeException("Exception while search account");
    }

    public boolean deleteAccount(boolean keyAccount) {
        if(keyAccount)
            throw new RuntimeException("Key account cannot be deleted");
        return true;
    }
}
