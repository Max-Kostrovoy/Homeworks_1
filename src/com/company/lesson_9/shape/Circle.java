package com.company.lesson_9.shape;

public class Circle extends Shape {
    int x, y;

    @Override
    public void draw() {
        System.out.println("Рисуем круг " + getColor());
    }

    public Circle(String color, int x, int y) {
        super("Red");
        this.x = x;
        this.y = y;
    }
}
