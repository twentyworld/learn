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
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
