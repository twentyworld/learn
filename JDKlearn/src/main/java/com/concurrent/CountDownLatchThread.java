package com.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by teemper on 2018/3/3, 14:58.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class CountDownLatchThread implements Runnable {

    private CountDownLatch countDownLatch;

    public CountDownLatchThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
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
    public void run( ) {

        System.out.println("线程："+ Thread.currentThread().getName()+" is running.");
        try {
            Thread.sleep(1000);
            System.out.println("线程："+ Thread.currentThread().getName()+" finished.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            countDownLatch.countDown();
        }

    }
}
