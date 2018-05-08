package com.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by teemper on 2018/5/7, 22:22.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class ReentrantReadWriteLockLearn {
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        final ReentrantReadWriteLockLearn learn = new ReentrantReadWriteLockLearn();

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

    public void get(Thread thread) {
        rwl.readLock().lock();
        try {
            long start = System.currentTimeMillis();

            while (System.currentTimeMillis() - start <= 10) {
                System.out.println(thread.getName() + "正在进行读操作");
            }
            System.out.println(thread.getName() + "读操作完毕");
        } finally {
            rwl.readLock().unlock();
        }
    }
}
