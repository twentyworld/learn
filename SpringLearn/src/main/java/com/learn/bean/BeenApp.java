package com.learn.bean;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by teemper on 2017/10/23, 23:32.
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class BeenApp {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("beanConfiguration/beans.xml");
            AccountBean obj = (AccountBean) context.getBean("helloWorld");
            obj.getMessage();
        }

}



