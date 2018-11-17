package com.learn.bean;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by teemper on 2017/12/7, 12:04.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class AccountBeanList {
    private List<AccountBean> accountBeanList;

    @Autowired
    private String name;

    public AccountBeanList() {
    }

    public List<AccountBean> getAccountBeanList() {
        return accountBeanList;
    }

    public void setAccountBeanList(List<AccountBean> accountBeanList) {
        this.accountBeanList = accountBeanList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AccountBeanList{" + "accountBeanList=" + accountBeanList + ", name='" + name + '\'' + '}';
    }
}
