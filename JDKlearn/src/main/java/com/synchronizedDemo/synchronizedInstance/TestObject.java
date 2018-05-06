package com.synchronizedDemo.synchronizedInstance;

/**
 * Created by temper on 2018/5/6,上午4:35.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */
public class TestObject {

    private String name;

    public synchronized String methodA(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronized method a invoked." + Thread.currentThread());

        return "a";
    }

    public synchronized String methodB() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronized method b invoked." + Thread.currentThread());

        return "b";
    }
    public String methodC() {
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("synchronized method c invoked." + Thread.currentThread());

            return "c";
        }
    }

    public String methodD() {
        System.out.println("synchronized method d invoked." + Thread.currentThread());
        return "d";
    }

}
