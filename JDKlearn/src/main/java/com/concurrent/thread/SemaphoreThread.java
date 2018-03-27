package com.concurrent.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * Created by teemper on 2018/3/3, 17:19.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class SemaphoreThread implements Runnable {

    private CountDownLatch countDownLatch;
    private Semaphore semaphore;

    public SemaphoreThread(CountDownLatch countDownLatch, Semaphore semaphore) {
        this.countDownLatch = countDownLatch;
        this.semaphore = semaphore;
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
        try {
            semaphore.acquire();
            System.out.println("thread: " +Thread.currentThread().getName()+"is asking a new acquirement.");
            Thread.sleep(1000);
            System.out.println("thread: " +Thread.currentThread().getName()+"release the acquirement.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            countDownLatch.countDown();
            semaphore.release();
        }

    }
}
