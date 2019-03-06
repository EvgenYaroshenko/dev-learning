package com.github.iaroshenko.ievgen.after.adapter.objectadapter.dto;

public class LineImpl implements Shape {
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("LineImpl from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
}
