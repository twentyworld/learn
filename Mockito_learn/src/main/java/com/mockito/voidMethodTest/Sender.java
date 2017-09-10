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
    User user;

    public Sender(User user) {
        this.user = user;
    }

    public Sender() {
    }

    public void send(){
        System.out.println(user.toString());
        String message = "message";
        emailer.send(message);
    }



    public void setEmailer(Emailer emailer) {
        this.emailer = emailer;
    }


    public void setUser(User user) {
        this.user = user;
    }
}
