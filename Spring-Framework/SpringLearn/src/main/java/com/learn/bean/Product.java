package com.learn.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by teemper on 2017/12/7, 12:29.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class Product {
    private AccountBean accountBean;
    private String name;


    public AccountBean getAccountBean() {
        return accountBean;
    }

    @Autowired
    @Qualifier("accountBean1")
    public void setAccountBean(AccountBean accountBean) {
        this.accountBean = accountBean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
