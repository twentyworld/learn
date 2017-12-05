package com.learn.bean;

/**
 * Created by teemper on 2017/12/5, 23:30.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class AccountBeanChild {
    private String message;
    private Integer id;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void init(){
        System.out.println("init");
    }
    public void initial(){
        System.out.println("initial");
    }

    public void destroy(){
        System.out.println("destroy");
    }

}
