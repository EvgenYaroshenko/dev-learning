package com.github.iaroshenko.ievgen.after.adapter.objectadapter.dto;

import com.github.iaroshenko.ievgen.before.adapter.dto.Rectangle;

public class RectangleAdapterImpl implements Shape{

    private Rectangle rectangle;

    public RectangleAdapterImpl(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        rectangle.draw(x, y, width, height);
    }
}
