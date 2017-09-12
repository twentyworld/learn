package com.mockito.voidMethodTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by teemper on 2017/9/10, 16:32.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class Sender extends Account {

    Emailer emailer;
    User user;

    public Sender(Id id) {
        super(id);
    }


    public void send(){
        System.out.println(user.toString());
        List<Id> str = getNaming();
        System.out.println(str);
        String message = "message";
        emailer.send(message);
    }

    public List<Id> getNaming(){
        return getId();
    }
    public List<Id> getId(){
        List<Id> list = new ArrayList<>();
        list.add(new Id("that"));
        return list;
    }

    public void setEmailer(Emailer emailer) {
        this.emailer = emailer;
    }


    public void setUser(User user) {
        this.user = user;
    }
}
