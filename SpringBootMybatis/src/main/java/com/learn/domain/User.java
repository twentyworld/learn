package com.learn.domain;

/**
 * Created by teemper on 2017/12/6, 21:13.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class User {
    private String name;
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}
