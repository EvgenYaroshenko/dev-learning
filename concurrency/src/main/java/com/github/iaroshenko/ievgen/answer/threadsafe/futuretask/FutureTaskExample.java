package com.github.iaroshenko.ievgen.answer.threadsafe.futuretask;

import java.util.concurrent.*;

public class FutureTaskExample {
    public static void main(String[] args) {
        MyRunable thread1 = new MyRunable(1000);
        MyRunable thread2 = new MyRunable(2000);
        FutureTask<String> futureTask = new FutureTask<>(thread1, "Future task 1 is completed");
        FutureTask<Integer> futureTask2 = new FutureTask<>(thread2, 22);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(futureTask);
        executorService.submit(futureTask2);

        while (true) {
            try {
                if (futureTask.isDone() && futureTask2.isDone()) {
                    System.out.println("Both future task completed");
                    executorService.shutdown();
                    return;
                }
                if (!futureTask.isDone()) {
                    System.out.println("Waiting fo Future 1 to complete" + futureTask.get());
                }

                Integer s = futureTask2.get(550, TimeUnit.MILLISECONDS);

                if (s != null) {
                    System.out.println("FutureTask2 output=" + s);
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}
