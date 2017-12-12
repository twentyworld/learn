package com.learn.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by teemper on 2017/12/7, 12:51.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */

@Configuration
public class AccountBeanConfiguration {
    @Bean
    public AccountBean accountBean(){
        return new AccountBean("string",55234);
    }
}
