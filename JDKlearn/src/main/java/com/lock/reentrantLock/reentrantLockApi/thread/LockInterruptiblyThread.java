package com.lock.reentrantLock.reentrantLockApi.thread;

import java.util.concurrent.locks.Lock;

/**
 * Created by teemper on 2018/5/8, 21:42.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class LockInterruptiblyThread implements Runnable {

    private Lock lock;

    public LockInterruptiblyThread(Lock lock) {
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
            //注意，如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将InterruptedException抛出
            lock.lockInterruptibly();
            try {
                System.out.println(Thread.currentThread() + "得到了锁");
                long startTime = System.currentTimeMillis();
                for (; ; ) {
                    if (System.currentTimeMillis() - startTime >= 5000) break;
                    //插入数据
                }
            } finally {
                System.out.println(Thread.currentThread().getName() + "执行finally");
                lock.unlock();
                System.out.println(Thread.currentThread() + "释放了锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + "被中断");
        }
    }
}
