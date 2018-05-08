package com.lock.reentrantLock.thread;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * Created by teemper on 2018/5/8, 21:27.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class TryLockWithTimeThread implements Runnable {
    private List<Integer> list;
    private Lock lock;

    public TryLockWithTimeThread(List<Integer> list, Lock lock) {
        this.list = list;
        this.lock = lock;
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
            if (lock.tryLock(1, TimeUnit.MICROSECONDS)) {
                try {
                    System.out.println(Thread.currentThread() + "得到了锁");
                    for (int i = 0; i < 10; i++) {
                        list.add(i);
                    }
                    Thread.sleep(100);
                } catch (Exception e) {
                    // TODO: handle exception
                } finally {
                    System.out.println(Thread.currentThread() + "释放了锁");
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread() + "获取锁失败");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
