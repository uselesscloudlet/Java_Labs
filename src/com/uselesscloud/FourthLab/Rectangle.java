package com.uselesscloud.FourthLab;

public class Rectangle extends Point {
    @Override
    public void draw() {
        System.out.println(String.format("Прямоугольник: x = %f, y = %f", x, y));
    }
}
