package com.learn.domain;

/**
 * Created by teemper on 2017/12/6, 21:13.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class User {
    private int id;
    private String name;


    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
