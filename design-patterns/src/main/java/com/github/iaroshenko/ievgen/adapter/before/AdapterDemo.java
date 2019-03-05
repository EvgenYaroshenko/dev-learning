package com.github.iaroshenko.ievgen.adapter.before;

import com.github.iaroshenko.ievgen.adapter.before.dto.Line;
import com.github.iaroshenko.ievgen.adapter.before.dto.Rectangle;

public class AdapterDemo {
    public static void main(String[] args) {
        Object[] shapes = {new Line(), new Rectangle()};
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;
        int width = 40;
        int height = 40;
        for (Object shape : shapes) {
            if (shape instanceof Line) {
                ((Line)shape).draw(x1, y1, x2, y2);
            } else if (shape instanceof Rectangle) {
                ((Rectangle)shape).draw(x2, y2, width, height);
            }
        }
    }
}
