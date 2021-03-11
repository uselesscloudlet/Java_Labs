package com.uselesscloud.SecondLab;

public class Circle extends Point {
    @Override
    public void draw() {
        System.out.println(String.format("Круг: x = %f, y = %f", x, y));
    }
}
