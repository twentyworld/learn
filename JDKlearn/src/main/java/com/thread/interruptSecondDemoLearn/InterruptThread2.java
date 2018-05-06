package com.thread.interruptSecondDemoLearn;

import java.util.concurrent.TimeUnit;

/**
 * Created by teemper on 2018/5/7, 1:22.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class InterruptThread2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(){
            @Override
            public void run(){
                while(true){
                    System.out.println("未被中断");
                }
            }
        };
        t1.start();
//        TimeUnit.SECONDS.sleep(2);
//        Thread.sleep(100000);
        t1.interrupt();

    }
}
