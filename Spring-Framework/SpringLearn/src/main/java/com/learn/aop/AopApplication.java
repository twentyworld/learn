package com.learn.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by teemper on 2017/12/7, 15:03.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class AopApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanConfiguration/aopBeans.xml");

        Student student = (Student) context.getBean("student");
        student.getAge();
        student.getName();
        student.printThrowException();
    }
}
