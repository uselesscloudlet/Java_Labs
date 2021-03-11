package com.uselesscloud.LabPackets.ru.novsu.povt.gdi.graphics;

public class Ellipse extends Rectangle {
    @Override
    public void draw() {
        System.out.println(String.format("Эллипс: x = %f, y = %f", x, y));
    }
}
