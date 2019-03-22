package com.github.iaroshenko.ievgen.answer.threadsafe;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


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
        for (int i = 0; i < 10; i++) {
            int v = r.nextInt();
            add(v);
            //TODO the problem is within hidden iteration in set.toString(). It could cause concurrent modification.
            System.out.println("DEBUG: added  element  " + v);
        }
    }
}