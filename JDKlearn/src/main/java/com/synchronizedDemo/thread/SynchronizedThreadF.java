package com.synchronizedDemo.thread;

import com.synchronizedDemo.Message;

/**
 * Created by teemper on 2018/5/6, 22:31.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class SynchronizedThreadF implements Runnable {

    private Message message;

    public SynchronizedThreadF(Message object) {
        this.message = object;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", method f, number= "+ message.methodF());
    }
}
