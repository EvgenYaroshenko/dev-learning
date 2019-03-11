package com.github.iaroshenko.ievgen.before.decorator.dto;

public class AwithY  extends A {
    @Override
    public void doIt() {
        super.doIt();
        doY();
    }

    public void doY()  {
        System.out.print('Y');
    }
}
