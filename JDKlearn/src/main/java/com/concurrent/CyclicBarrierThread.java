package com.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by teemper on 2018/3/3, 16:22.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class CyclicBarrierThread implements Runnable {

    private CyclicBarrier cyclicBarrier;

    public CyclicBarrierThread(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
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

        System.out.println("thread "+Thread.currentThread().getName()+" is writing data.");

        try {
            Thread.sleep(1000);
            System.out.println("writing end.");
//            cyclicBarrier.await(5000, TimeUnit.MILLISECONDS);
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("all sub thread off.");
    }
}
