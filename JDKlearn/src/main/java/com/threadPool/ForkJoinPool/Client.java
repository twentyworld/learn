package com.threadPool.ForkJoinPool;

/**
 * Created by teemper on 2018/10/2, 16:37.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class Client {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0 ;i<numbers.length;i++) {
            numbers[i] = i;
        }

        int sum = 0;
        for (Integer i: numbers){
            sum+= i;
        }
        System.out.println(sum);

        System.out.println(new ForkJoinCalculator().getResult(numbers));


    }
}
