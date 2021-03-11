package com.uselesscloud.FourthLab;

public class MyWindow implements Movable {
    private double x;
    private double y;

    public MyWindow() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println(String.format("Координаты изменены: x = %f, y = %f", x, y));
    }
}
