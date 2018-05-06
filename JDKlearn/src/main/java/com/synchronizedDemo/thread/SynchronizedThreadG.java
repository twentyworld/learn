package com.synchronizedDemo.thread;

import com.synchronizedDemo.Message;

/**
 * Created by teemper on 2018/5/7, 0:29.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class SynchronizedThreadG implements Runnable{

    private Message message;

    public SynchronizedThreadG(Message object) {
        this.message = object;
    }
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", method g, number= "+ message.methodG());
    }
}
