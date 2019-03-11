package com.github.iaroshenko.ievgen.after.decorator.dto;

public class Z extends D {
    public Z(I core) {
        super(core);
    }

    @Override
    public void doIt() {
        super.doIt();
        doZ();
    }

    private void doZ() {
        System.out.print('Z');
    }
}
