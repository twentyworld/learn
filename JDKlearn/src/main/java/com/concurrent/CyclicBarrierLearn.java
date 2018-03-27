package com.concurrent;

import com.concurrent.thread.CyclicBarrierThread;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by teemper on 2018/3/3, 16:21.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class CyclicBarrierLearn {
    public static void main(String[] args) throws InterruptedException {
//        CyclicBarrier cyclicBarrier = new CyclicBarrier(100);

        CyclicBarrier cyclicBarrier = new CyclicBarrier(10, new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        for(int i =0;i<9;i++) {
            new Thread(new CyclicBarrierThread(cyclicBarrier)).start();
        }

        Thread.sleep(4000);

        new Thread(new CyclicBarrierThread(cyclicBarrier)).start();

        System.out.println("all invoked.");
    }


}
