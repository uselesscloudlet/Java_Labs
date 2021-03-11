package com.uselesscloud.LabPackets.ru.novsu.povt.gdi.graphics;

public class Background extends Graph {
    private String color = "None";
    private String texture = "None";

    @Override
    public void draw() {
        System.out.println(String.format("Цвет: %s, %s", color, texture));
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getColor() {
        return this.color;
    }

    public String getTexture() {
        return this.texture;
    }
}
