package com.lock.reentrantLock.conditionDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by teemper on 2018/5/8, 23:06.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class ArrayBuffer {

    private Lock lock = new ReentrantLock();
    private Condition write;
    private Condition read;
    public ArrayBuffer() {
        write = lock.newCondition();
        read = lock.newCondition();
    }
    private String[] array = new String[30];
    private int putPoint, takePoint;
    private int count = 0;

    public String read() {
        lock.lock();
        try {
            String temp = null;
            if (count == 0) {
                try {
                    System.out.println("buffer is empty");
                    write.signal();
                    read.await();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("takePoint: " + takePoint);
                temp = array[takePoint()];
                count--;
                takePoint++;

            }
            return temp;
        }finally {
            lock.unlock();
        }
    }

    public void put(String number) {
        lock.lock();
        try{
            if (count<array.length){

                array[putPoint()] = number;
                count++;
                System.out.println("putPoint: " + putPoint);
                putPoint++;

            }else{
                try {
                    System.out.println("buffer is full.");
                    read.signal();
                    write.await();
//                    read.signal();
                    System.out.println("count: " + count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }finally {
            lock.unlock();
        }


    }

    private int putPoint() {
        return putPoint%(array.length);
    }

    private int takePoint() {
        return takePoint%(array.length);
    }

}
