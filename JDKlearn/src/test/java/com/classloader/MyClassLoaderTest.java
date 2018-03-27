package com.classloader; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 
* MyClassLoader Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 27, 2018</pre> 
* @version 1.0 
*/ 
public class MyClassLoaderTest { 

    @Test
    public void testMyClassLoader() {
        System.out.println("testMyClassLoader");
        MyClassLoader classLoader = new MyClassLoader("C:\\Users\\w\\IdeaProjects\\learns\\JDKlearn\\src\\main\\resources\\classFile\\tsi");
        Class classes  = null;
//        try {
//            classes = classLoader.loadClass("com.classloader.test.Test");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        classes = classLoader.findClass("com.classloader.test.Test");
        Assert.assertTrue(invokeMethod(classes).equals("this is a new test about classLoader."));
    }


    @Test
    public void testDefaultClassLoader() {
        System.out.println("testDefaultClassLoader, and test the class in the classpath.");
        Class classes = null;
        try {
            classes = Thread.currentThread().getContextClassLoader().loadClass("com.classloader.test.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(invokeMethod(classes).equals("this is a new test about classLoader.but with these words."));
    }


    //先调用自己实现的classloader，后调用appclassloader的话，结果会不同。
    @Test
    public void testMyClassLoaderFirst() {
        MyClassLoader classLoader = new MyClassLoader("C:\\Users\\w\\IdeaProjects\\learns\\JDKlearn\\src\\main\\resources\\classFile\\tsi");
        Class classes  = null;
        try {
            classes = classLoader.loadClass("com.classloader.test.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String MyClassLoader = invokeMethod(classes);


        ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader1.toString());
        Class classes2  = null;
        try {
            classes2 = classLoader1.loadClass("com.classloader.test.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        String defaultClassLoader = invokeMethod(classes2);
        System.out.println(MyClassLoader);
        System.out.println(defaultClassLoader);
        Assert.assertFalse(MyClassLoader.equals(defaultClassLoader));
    }

    @Test
    public void testAppClassLoaderFirst() {

        ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
        Class classes2  = null;

        try {
            classes2 = classLoader1.loadClass("com.classloader.test.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String defaultClassLoader = invokeMethod(classes2);


        new Thread(new Runnable() {
            @Override
            public void run() {
                MyClassLoader classLoader = new MyClassLoader("C:\\Users\\w\\IdeaProjects\\learns\\JDKlearn\\src\\main\\resources\\classFile\\tsi");
                Class classes  = null;
                try {
                    classes = classLoader.loadClass("com.classloader.test.Test");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                String MyClassLoader = invokeMethod(classes);

                System.out.println(MyClassLoader);
            }
        }).start();




//        System.out.println(MyClassLoader);
//        System.out.println(defaultClassLoader);
//        Assert.assertFalse(MyClassLoader.equals(defaultClassLoader));
    }





    private String invokeMethod(Class classes) {
        System.out.println(classes.getClassLoader().toString());
        System.out.println(classes.getClassLoader().getParent().toString());
        Object objects = new Object();
        try {
            Object object = classes.newInstance();
            Method method = classes.getMethod("print",null);

            objects = method.invoke(object,null);
            System.out.println("invoke the class in the resources: "+ objects.toString());
            System.out.println();

        } catch (InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return objects.toString();
    }

} 
