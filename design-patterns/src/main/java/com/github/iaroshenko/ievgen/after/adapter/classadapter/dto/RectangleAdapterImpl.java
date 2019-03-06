package com.github.iaroshenko.ievgen.after.adapter.classadapter.dto;

import com.github.iaroshenko.ievgen.before.adapter.dto.Rectangle;

public class RectangleAdapterImpl extends Rectangle implements Shape{

    public RectangleAdapterImpl() {
        super();
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        super.draw(x, y, width, height);
    }
}
