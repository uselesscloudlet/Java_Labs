package com.uselesscloud.LabPackets.ru.novsu.povt.gdi;

import com.uselesscloud.LabPackets.ru.novsu.povt.gdi.graphics.*;

public class Main {
    public static void main(String[] args) {
        Point circle = new Circle();
        circle.moveTo(100, 100);
        circle.draw();
        circle.move(50, 50);
        circle.draw();

        Point ellipse = new Ellipse();
        ellipse.draw();
        ellipse.move(140, 140);
        ellipse.draw();

        Background bg = new Background();
        bg.setColor("Dark");
        bg.setTexture("Steel");
        bg.draw();
    }
}
