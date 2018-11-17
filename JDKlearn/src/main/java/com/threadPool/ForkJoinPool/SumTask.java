package com.threadPool.ForkJoinPool;

import java.util.concurrent.RecursiveTask;

/**
 * Created by teemper on 2018/10/2, 16:40.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class SumTask extends RecursiveTask<Integer> {

    private int[] numbers;
    private int start;
    private int end;

    public SumTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    protected Integer compute() {
        if (end - start < 5) {

            int total = 0;

            for (int i = start; i < end; i++) {
                total += numbers[i];
            }
            return total;

        } else {
            int middle = (start + end) / 2;
            SumTask taskLeft = new SumTask(numbers, start, middle);
            SumTask taskRight = new SumTask(numbers, middle, end);
            taskLeft.fork();
            taskRight.fork();
            return taskLeft.join() + taskRight.join();
        }


    }

}
