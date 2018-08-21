package com.learn;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * Created by teemper on 2018/8/21, 21:47.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class Person {
    private String name;
    private int age;
    @JsonUnwrapped
    private House houses;

    public Person() {
    }

    public Person(String name, int age, House houses) {
        this.name = name;
        this.age = age;
        this.houses = houses;
    }

    public House getHouses() { return houses; }
    public void setHouses(House houses) { this.houses = houses; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", houses=" + houses + '}';
    }
}


