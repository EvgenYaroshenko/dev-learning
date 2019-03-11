package com.github.iaroshenko.ievgen.after.decorator.dto;

public class Y extends D {
    public Y(I core) {
        super(core);
    }

    @Override
    public void doIt() {
        super.doIt();
        doY();
    }

    private void doY() {
        System.out.print('Y');
    }
}
