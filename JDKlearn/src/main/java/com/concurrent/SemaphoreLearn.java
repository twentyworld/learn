package com.concurrent;

import com.concurrent.thread.SemaphoreThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * Created by teemper on 2018/3/3, 17:13.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class SemaphoreLearn {

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(10);
        Semaphore semaphore = new Semaphore(3,true);

        for(int i = 0;i<10;i++) {
            new Thread(new SemaphoreThread(countDownLatch,semaphore)).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all worker has finish the work");

    }

}
