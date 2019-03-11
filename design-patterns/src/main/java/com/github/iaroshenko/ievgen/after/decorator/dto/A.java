package com.github.iaroshenko.ievgen.after.decorator.dto;

public class A implements I {
    @Override
    public void doIt() {
        System.out.print('A');
    }
}
