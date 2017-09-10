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

    public void send(){
        String message = "message";
        emailer.send(message);
    }





}
