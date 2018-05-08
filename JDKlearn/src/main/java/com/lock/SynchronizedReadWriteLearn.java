package com.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by teemper on 2018/5/7, 22:21.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class SynchronizedReadWriteLearn {
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        final SynchronizedReadWriteLearn learn = new SynchronizedReadWriteLearn();

        new Thread() {
            public void run() {
                learn.get(Thread.currentThread());
            }

            ;
        }.start();

        new Thread() {
            public void run() {
                learn.get(Thread.currentThread());
            }

            ;
        }.start();

    }

    public synchronized void get(Thread thread) {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <= 1) {
            System.out.println(thread.getName() + "正在进行读操作");
        }
        System.out.println(thread.getName() + "读操作完毕");
    }
}
