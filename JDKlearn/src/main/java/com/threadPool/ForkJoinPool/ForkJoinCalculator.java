package com.threadPool.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by teemper on 2018/10/2, 16:47.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class ForkJoinCalculator implements Calculator {

    private ForkJoinPool pool;

    public ForkJoinCalculator() {
        this.pool = new ForkJoinPool();
    }

    @Override
    public int getResult(int[] numbers) {
        return pool.invoke(new SumTask(numbers, 0, numbers.length));
    }
}
