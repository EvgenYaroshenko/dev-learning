package com.github.iaroshenko.ievgen.code.review;

import java.util.concurrent.CountDownLatch;

/**
 * Write class with distinct sets of active and passive threads,
 * where we want to block the passive threads until all active threads give permission
 * for the passive threads to procced
 *
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Runnable thread1 = new Service("thread 1", latch, 5000L);
        Runnable thread2 = new Service("thread 2", latch, 1000L);
        Runnable thread3 = new Service("thread 3", latch, 1000L);
        thread1.run();
        thread2.run();
        thread3.run();
        try {
            latch.await();
            System.out.println("All threads are up");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

class Service implements Runnable {
    String name;
    CountDownLatch latch;
    long t;

    public Service(String name, CountDownLatch latch, long t) {
        this.name = name;
        this.latch = latch;
        this.t = t;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(t);
            System.out.println("Thread " + name + " is up");
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}