package com.learn.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by teemper on 2018/11/12, 23:15.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
@Configuration
public class AccountBeanListConfig {

    @Bean(name = "this")
    public AccountBeanList accountBeanList() {
        AccountBeanList accountBeanList = new AccountBeanList();
        accountBeanList.setName("name");



        return accountBeanList;
    }

}
