package com.learn.bean;

/**
 * Created by teemper on 2017/10/23, 21:42.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class AccountBean {
    private String message;
    private int id;

    public AccountBean() {
    }

    public AccountBean(String message, int id) {
        this.message = message;
        this.id = id;
    }

    public void setMessage(String message){
        this.message  = message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "AccountBean{" + "message='" + message + '\'' + ", id=" + id + '}';
    }
}
