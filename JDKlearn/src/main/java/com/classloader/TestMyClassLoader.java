package com.classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by teemper on 2018/3/28, 0:51.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class TestMyClassLoader {
    public static void main(String[] args) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        Class classes = null;
        try {
            classes = classLoader.loadClass("com.classloader.test.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        System.out.println(classes.getClassLoader().toString());
//        System.out.println(classes.getClassLoader().getParent().toString());
//        Object objects = new Object();
        try {
            Object object = classes.newInstance();
            Method method = classes.getMethod("print",null);

            Object objects = method.invoke(object,null);
            System.out.println("invoke the class in the classpath: "+ objects.toString());
            System.out.println();

        } catch (InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                MyClassLoader classLoader = new MyClassLoader("C:\\Users\\w\\Desktop\\test");
                Class classes = null;
                try {
                    classes = classLoader.loadClass("com.classloader.test.Test");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    Object object = classes.newInstance();
                    Method method = classes.getMethod("print",null);

                    Object objects = method.invoke(object,null);
                    System.out.println("invoke the class in the resources: "+ objects.toString());

                } catch (InstantiationException | IllegalAccessException
                        | NoSuchMethodException | InvocationTargetException e) {
                    e.printStackTrace();
                }


            }
        }).start();




    }


//    private static String invokeMethod(Class classes) {
//        System.out.println(classes.getClassLoader().toString());
//        System.out.println(classes.getClassLoader().getParent().toString());
//        Object objects = new Object();
//        try {
//            Object object = classes.newInstance();
//            Method method = classes.getMethod("print",null);
//
//            objects = method.invoke(object,null);
//            System.out.println("invoke the class in the resources: "+ objects.toString());
//            System.out.println();
//
//        } catch (InstantiationException | IllegalAccessException
//                | NoSuchMethodException | InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        return objects.toString();
//    }

}
