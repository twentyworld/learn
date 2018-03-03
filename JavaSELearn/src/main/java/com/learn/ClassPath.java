package com.learn;

/**
 * Created by teemper on 2018/1/11, 21:38.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class ClassPath {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("happy");
        ClassPath path = new ClassPath();
        System.out.println(path.getClass().getClassLoader().getClass().getCanonicalName());
    }
}
