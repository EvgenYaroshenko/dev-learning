package com.github.iaroshenko.ievgen.after.adapter.objectadapter;

import com.github.iaroshenko.ievgen.after.adapter.objectadapter.dto.LineImpl;
import com.github.iaroshenko.ievgen.after.adapter.objectadapter.dto.RectangleAdapterImpl;
import com.github.iaroshenko.ievgen.after.adapter.objectadapter.dto.Shape;
import com.github.iaroshenko.ievgen.before.adapter.dto.Rectangle;

public class AdapterDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleAdapterImpl(new Rectangle()),
                new LineImpl()};
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
