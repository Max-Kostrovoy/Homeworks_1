package com.company.lesson_9.shape;

public abstract class Shape {

    public Shape() {
    }

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;

        Shape shape = (Shape) o;

        return color.equals(shape.color);

    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("Yellow", 3, 4);
        shapes[1] = new Rectangle("Black", 7, 8);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
