package com.github.iaroshenko.ievgen.before.decorator.dto;

public class AwithZ  extends A {
    @Override
    public void doIt() {
        super.doIt();
        doZ();
    }

    public void doZ() {
        System.out.print('Z');
    }
}