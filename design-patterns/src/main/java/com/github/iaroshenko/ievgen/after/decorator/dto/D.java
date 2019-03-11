package com.github.iaroshenko.ievgen.after.decorator.dto;

abstract class D implements I{
    private I core;

    public D(I core) {
        this.core = core;
    }

    public void doIt() {
        core.doIt();
    }
}
