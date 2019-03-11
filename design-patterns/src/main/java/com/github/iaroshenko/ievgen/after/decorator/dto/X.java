package com.github.iaroshenko.ievgen.after.decorator.dto;

public class X extends D {
    public X(I core) {
        super(core);
    }

    @Override
    public void doIt() {
        super.doIt();
        doX();
    }

    private void doX() {
        System.out.print('X');
    }
}
