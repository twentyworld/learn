package com.lock.reentrantLock.reentrantLockApi;

import com.lock.reentrantLock.reentrantLockApi.thread.TryLockThread;
import com.lock.reentrantLock.reentrantLockApi.thread.TryLockWithTimeThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by teemper on 2018/5/7, 22:06.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class ReentrantLockTryLockLearn {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        Lock lock = new ReentrantLock();    //注意这个地方

        TryLockThread thread1 = new TryLockThread(list, lock);
        TryLockThread thread2 = new TryLockThread(list, lock);
        TryLockWithTimeThread thread3 = new TryLockWithTimeThread(list, lock);

        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();

    }

}
