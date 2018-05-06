package com.synchronizedDemo;

/**
 * Created by temper on 2018/5/6,上午4:35.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */
public class Message {

    private int number;
    private static int numbers;

    public synchronized int methodA() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        number = number +1;
        return number;
    }

    public synchronized int methodB() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        number = number +1;
        return number;
    }

    public int methodC() {
        synchronized (this) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number = number +1;
            return number;
        }
    }

    public int methodD() {
        number = number +1;
        return number;
    }
    public static synchronized int methodE() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        numbers = numbers +1;
        return numbers;

    }
    public synchronized int methodF() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        numbers = numbers +1;
        return numbers;
    }

    public int methodG() {
        synchronized (Message.class) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numbers = numbers +1;
            return numbers;
        }
    }



}
