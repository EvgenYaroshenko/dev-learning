package com.github.iaroshenko.ievgen.question.threadsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Is class thread safe? If not, make it thread safe
public class ListHelper<E> {
    public List<E> list =
            Collections.synchronizedList(new ArrayList<E>());
    public synchronized boolean putIfAbsent(E x) {
        boolean absent = !list.contains(x);
        if (absent)
            list.add(x);
        return absent;
    }
}
