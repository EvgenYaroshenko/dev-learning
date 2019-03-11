package com.github.iaroshenko.ievgen.before.decorator.dto;

public class AwithXY  extends AwithX {
    private AwithY obj = new AwithY();
    @Override
    public void doIt() {
        super.doIt();
        obj.doY();
    }
}