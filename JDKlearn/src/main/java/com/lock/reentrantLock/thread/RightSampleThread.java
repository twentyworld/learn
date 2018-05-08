package com.lock.reentrantLock.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

/**
 * Created by teemper on 2018/5/8, 20:44.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class RightSampleThread implements Runnable {
    private Lock lock;
    private List<Integer> list;

    public RightSampleThread(Lock lock, List<Integer> list) {
        this.lock = lock;
        this.list = list;
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
        lock.lock();
        try {
            System.out.println(Thread.currentThread() + "得到了锁");
            for (int i = 0; i < 5; i++) list.add(i);
            Thread.sleep(200);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println(Thread.currentThread() + "释放了锁");
            lock.unlock();
        }
    }
}
