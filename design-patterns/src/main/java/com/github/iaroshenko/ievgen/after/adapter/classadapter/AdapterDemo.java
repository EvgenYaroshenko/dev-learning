package com.github.iaroshenko.ievgen.after.adapter.classadapter;


import com.github.iaroshenko.ievgen.after.adapter.classadapter.dto.LineImpl;
import com.github.iaroshenko.ievgen.after.adapter.classadapter.dto.RectangleAdapterImpl;
import com.github.iaroshenko.ievgen.after.adapter.classadapter.dto.Shape;

public class AdapterDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleAdapterImpl(),
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
