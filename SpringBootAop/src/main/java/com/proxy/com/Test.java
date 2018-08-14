package com.proxy.com;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Created by teemper on 2018/7/7, 18:15.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//
//        Class proxy = Proxy.getProxyClass(Animal.class.getClassLoader(), Animal.class);
//        Constructor constructor = proxy.getConstructor(InvocationHandler.class);
//
//        Animal animal = (Animal) constructor.newInstance(new DogProxyHandler(new Dog()));
//
//        animal.sound();



        Dog dog = new Dog();

        Animal animal = (Animal) Proxy.newProxyInstance(
                        Animal.class.getClassLoader(),
                        new Class[]{Animal.class},
                        new DogProxyHandler(dog));

        animal.sound();

    }
}
