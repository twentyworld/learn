package com.mockito.voidMethodTest;

/**
 * Created by teemper on 2017/9/12, 20:57.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */


public abstract class Account {
    private Id id;

    public Account(Id id) {
        System.out.println(this.getClass().getName());
        System.out.println(id.getId());
        this.id = id;
    }

    protected String getName() {
        return id.getId();
    }


}
