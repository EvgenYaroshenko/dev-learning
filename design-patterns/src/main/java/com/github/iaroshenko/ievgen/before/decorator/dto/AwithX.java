package com.github.iaroshenko.ievgen.before.decorator.dto;

public class AwithX extends A  {
    @Override
    public  void doIt() {
        super.doIt();
        doX();
    }

    private void doX() {
        System.out.print('X');
    }
}
