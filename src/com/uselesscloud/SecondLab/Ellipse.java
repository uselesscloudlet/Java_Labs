package com.uselesscloud.SecondLab;

public class Ellipse extends Rectangle {
    @Override
    public void draw() {
        System.out.println(String.format("Эллипс: x = %f, y = %f", x, y));
    }
}
