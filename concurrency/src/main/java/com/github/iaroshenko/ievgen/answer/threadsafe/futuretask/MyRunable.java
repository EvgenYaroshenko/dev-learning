package com.github.iaroshenko.ievgen.answer.threadsafe.futuretask;

public class MyRunable implements Runnable{

    private long timeout;

    public MyRunable(long timeout) {
        this.timeout = timeout;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeout);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
