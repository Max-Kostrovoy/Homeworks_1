package com.company.lesson_9.shape;

public class Rectangle extends Shape {

    public int x;
    public int y;

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник " + getColor());
    }

    public Rectangle(String color, int x, int y) {
        super("Green");
        this.x = x;
        this.y = y;
    }
}
