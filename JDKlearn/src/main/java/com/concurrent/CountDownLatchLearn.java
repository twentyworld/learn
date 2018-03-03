package com.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by teemper on 2018/3/3, 14:57.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class CountDownLatchLearn {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(new CountDownLatchThread(countDownLatch)).start();
        }

        System.out.println("waiting two threads running off.");
        try {
            countDownLatch.await();
            System.out.println("main thread running.");
            System.out.println("end.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
