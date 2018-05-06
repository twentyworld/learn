package com.synchronizedDemo.thread;

import com.synchronizedDemo.Message;

/**
 * Created by teemper on 2018/5/6, 22:00.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class SynchronizedThreadE implements Runnable {
    private Message message;

    public SynchronizedThreadE(Message object) {
        this.message = object;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", method e, number= "+ message.methodE());
    }
}
