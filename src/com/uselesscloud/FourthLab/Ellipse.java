package com.uselesscloud.FourthLab;

public class Ellipse extends Circle {
    @Override
    public void draw() {
        System.out.println(String.format("Эллипс: x = %f, y = %f", x, y));
    }
}
