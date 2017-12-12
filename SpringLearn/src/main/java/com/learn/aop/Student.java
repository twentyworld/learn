package com.learn.aop;

/**
 * Created by teemper on 2017/12/7, 15:02.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class Student {
    private Integer age;
    private String name;

    public Student() {
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
