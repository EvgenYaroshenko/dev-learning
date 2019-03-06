package com.github.iaroshenko.ievgen.before.adapter.dto;

/**
 * This is a legacy class from third party system
 */
public class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println("RectangleImpl with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}
