package com.github.iaroshenko.ievgen.before.decorator;

import com.github.iaroshenko.ievgen.before.decorator.dto.A;
import com.github.iaroshenko.ievgen.before.decorator.dto.AwithX;
import com.github.iaroshenko.ievgen.before.decorator.dto.AwithXY;
import com.github.iaroshenko.ievgen.before.decorator.dto.AwithXYZ;

public class Client {
    public static void main(String[] args) {
        A[] array = {new AwithX(), new AwithXY(), new AwithXYZ()};
        for (A a : array) {
            a.doIt();
            System.out.print("  ");
        }
    }
}
