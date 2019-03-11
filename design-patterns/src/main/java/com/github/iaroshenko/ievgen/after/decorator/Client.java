package com.github.iaroshenko.ievgen.after.decorator;

import com.github.iaroshenko.ievgen.after.decorator.dto.*;

public class Client {
    public static void main( String[] args ) {
        I[] array = {new X(new A()), new Y(new X(new A())),
                new Z(new Y(new X(new A())))};
        for (I anArray : array) {
            anArray.doIt();
            System.out.print("  ");
        }
    }
}
