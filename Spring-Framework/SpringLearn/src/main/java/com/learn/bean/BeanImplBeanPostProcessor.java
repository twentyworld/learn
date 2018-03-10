package com.learn.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import org.springframework.lang.Nullable;


/**
 * Created by teemper on 2017/12/5, 23:16.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class BeanImplBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beforeInitial");
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("afterInitial");
        return bean;
    }
}
