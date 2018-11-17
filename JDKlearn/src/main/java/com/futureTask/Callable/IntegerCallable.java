package com.futureTask.Callable;

import java.util.concurrent.Callable;

/**
 * Created by teemper on 2018/7/15, 0:45.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class IntegerCallable implements Callable<Integer> {

    private int size;
    private int start;

    public IntegerCallable(int size, int start) {
        this.size = size;
        this.start = start;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {

        int sum = 0;

        for (int i = 0;i< size;i++) {
            Thread.sleep(40);
            sum = sum + (start + i);
        }
        return sum;
    }
}
