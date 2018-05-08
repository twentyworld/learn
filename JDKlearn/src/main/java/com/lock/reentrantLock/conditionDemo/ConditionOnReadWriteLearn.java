package com.lock.reentrantLock.conditionDemo;

/**
 * Created by teemper on 2018/5/8, 23:06.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class ConditionOnReadWriteLearn {
    public static void main(String[] args) {
        ArrayBuffer buffer = new ArrayBuffer();
        ReadThread read = new ReadThread(buffer);
        WriteThread write = new WriteThread(buffer);

        new Thread(write).start();
        new Thread(read).start();


    }
}
