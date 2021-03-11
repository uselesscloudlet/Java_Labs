package com.uselesscloud.LabPackets.ru.novsu.povt.gdi.graphics;

public class Point extends Graph {
    protected double x = 0;
    protected double y = 0;
    private String color = "None";

    @Override
    public void draw() {
        System.out.println(String.format("Точка: x = %f, y = %f", x, y));
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
