package com.uselesscloud.FourthLab;

import java.util.Vector;

public class Main {
    public static void swapXY(Movable obj) {
        System.out.println(String.format("\nИзменяемые координаты: x = %f, y = %f", obj.getX(), obj.getY()));
        obj.moveTo(obj.getY(), obj.getX());
    }

    public static void main(String[] args) {
        Vector<Movable> movableObjs = new Vector<Movable>();
        Movable circle = new Circle();
        Movable ellipse = new Ellipse();
        Movable rectangle = new Rectangle();
        Movable window = new MyWindow();

        movableObjs.add(circle);
        circle.moveTo(50, 100);
        movableObjs.add(ellipse);
        ellipse.moveTo(100, 200);
        movableObjs.add(rectangle);
        rectangle.moveTo(200, 400);
        movableObjs.add(window);
        window.moveTo(400, 800);

        for (Movable obj : movableObjs) {
            try {
                swapXY(obj);
            } catch (NullPointerException exception) {
                System.out.println("Ошибка при замене координат.");
                exception.printStackTrace();
            }
        }
    }
}
