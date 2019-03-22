package com.github.iaroshenko.ievgen.question.threadsafe;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//Is class thread safe? If not, make it thread safe
public class ThreadSafeClass {

    private final Set<Integer> set = new HashSet<>();

    public synchronized void add(Integer i) {
        set.add(i);
    }

    public synchronized void remove(Integer i) {
        set.remove(i);
    }

    public void addTenThings() {
        Random r = new Random();
        for (int i = 0; i < 10; i++)
            add(r.nextInt());
        System.out.println("DEBUG: added ten elements to " + set);
    }
}