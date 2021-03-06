package com.learn.bean;


import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertTrue;

/**
 * Created by teemper on 2017/12/5, 21:25.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */

public class LoadBeanTest {

    @Test
    public void TestApplicationContextFirst(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanConfiguration/beans.xml");
        AccountBean accountBean = (AccountBean)context.getBean("accountBean");
        assertTrue(accountBean.getMessage().equals("Hello World!"));
    }
    @Test
    public void TestXmlBeanFactory(){
        XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("beanConfiguration/beans.xml"));
        AccountBean accountBean = (AccountBean)context.getBean("accountBean");
        assertTrue(accountBean.getMessage().equals("Hello World!"));
    }

    @Test
    public void TestApplicationContextSecond(){
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beanConfiguration/beans.xml");
        AccountBean accountBean = (AccountBean)context.getBean("accountBean");
        assertTrue(accountBean.getMessage().equals("Hello World!"));
    }

    @Test
    public void TestNamespace(){
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beanConfiguration/beans.xml");
        AccountBean accountBean = (AccountBean)context.getBean("accountBean2");
        assertTrue(accountBean.getMessage().equals("Hello World!"));
        //why this place there are three init
    }

    @Test
    public void TestPrototype(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanConfiguration/beans.xml");

        AccountBean accountBean1Object1 = (AccountBean)context.getBean("accountBean1");
        AccountBean accountBean1Object2 = (AccountBean)context.getBean("accountBean1");
        AccountBean accountBeanObject1 = (AccountBean)context.getBean("accountBean");
        AccountBean accountBeanObject2 = (AccountBean)context.getBean("accountBean");
        assertTrue(accountBean1Object1!=accountBean1Object2);
        assertTrue(accountBeanObject1==accountBeanObject2);
        assertTrue(accountBean1Object1!=accountBeanObject1);
        assertTrue(accountBean1Object1.getMessage().equals("Hello World!"));
    }

    @Test
    public void TestBeanInheritance(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanConfiguration/beans.xml");
        AccountBean accountBean = (AccountBean)context.getBean("accountBean");
        AccountBeanChild accountBeanChild =(AccountBeanChild) context.getBean("accountBeanChild");

        assertTrue(accountBean.getId()==123);
        assertTrue(accountBean.getMessage().equals("Hello World!"));

        assertTrue(accountBeanChild.getMessage().equals("Hello World!"));
        //this is what you should focus.
        assertTrue(accountBeanChild.getId() == 234);
        assertTrue(accountBeanChild.getPassword().equals("password"));
    }

    @Test
    public void TestBeanList(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanConfiguration/beans.xml");
        AccountBeanList accountBeanList = (AccountBeanList) context.getBean("accountBeanList");

        assertTrue(accountBeanList.getAccountBeanList().size()==2);
        assertTrue(accountBeanList.getAccountBeanList().get(0).getMessage().equals("Hello World!"));
        assertTrue(accountBeanList.getAccountBeanList().get(1).getId() == 123);
    }

    @Test
    public void TestXmlAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanConfiguration/beans.xml");
        Product product = (Product)context.getBean("product");

        assertTrue(product.getAccountBean().getId()==123);
        assertTrue(product.getName().equals("name"));
    }

    @Test
    public void TestAnnotationAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanConfiguration/beans.xml");
        Product product = (Product)context.getBean("product2");
        assertTrue(product.getAccountBean().getId()==123);
        assertTrue(product.getName().equals("name"));
    }

    @Test
    public void TestAnnotationConfiguration(){

        ApplicationContext context = new AnnotationConfigApplicationContext(AccountBeanConfiguration.class);

        AccountBean accountBean = context.getBean(AccountBean.class);
        assertTrue(accountBean.getMessage().equals("string"));
    }
}
