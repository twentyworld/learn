package com.lock.reentrantLock;

import com.lock.reentrantLock.thread.LockInterruptiblyThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by teemper on 2018/5/7, 22:10.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class LockInterruptiblyLockLearn {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        LockInterruptiblyThread interruptiblyThread1 = new LockInterruptiblyThread(lock);
        LockInterruptiblyThread interruptiblyThread2 = new LockInterruptiblyThread(lock);

        Thread thread1 = new Thread(interruptiblyThread1);
        Thread thread2 = new Thread(interruptiblyThread2);

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.interrupt();
    }

}


