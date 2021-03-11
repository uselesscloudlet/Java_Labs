package com.uselesscloud.FourthLab;

public class Point implements Graph, Movable {
    protected double x;
    protected double y;
    private String color = "None";

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Точка: x = %f, y = %f", x, y));
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println(String.format("Координаты изменены: x = %f, y = %f", x, y));
    }

    public void move(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
