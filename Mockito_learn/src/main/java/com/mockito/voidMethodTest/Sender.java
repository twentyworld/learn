package com.mockito.voidMethodTest;

/**
 * Created by teemper on 2017/9/10, 16:32.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class Sender {

    Emailer emailer;

    String name;

    public Sender(String name) {
        this.name = name;
    }

    public Sender(Emailer emailer, String name) {
        this.emailer = emailer;
        this.name = name;
    }

    public void send(){
        String message = "message";
        emailer.send(message);
    }

}
