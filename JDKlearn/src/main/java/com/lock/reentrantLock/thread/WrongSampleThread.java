package com.lock.reentrantLock.thread;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by teemper on 2018/5/8, 20:33.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class WrongSampleThread implements Runnable {
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

    private ArrayList<Integer> arrayList;

    public WrongSampleThread(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        Lock lock = new ReentrantLock();    //注意这个地方
        lock.lock();
        try {
            System.out.println(Thread.currentThread() + "得到了锁");
            for (int i = 0; i < 5; i++) arrayList.add(i);
            Thread.sleep(100);
        } catch (Exception e) {
        } finally {
            System.out.println(Thread.currentThread() + "释放了锁");
            lock.unlock();
        }
    }
}
