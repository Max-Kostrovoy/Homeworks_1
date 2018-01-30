package com.company.lesson_8.Flower.src;

public class Flower {
    private String origin;
    private int daysToKeep;
    private double price;
    public static int number;
    public Flower[] flowers;
    public String flowerName;


    public Flower() {

    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getDaysToKeep() {
        return daysToKeep;
    }

    public void setDaysToKeep(int daysToKeep) {
        this.daysToKeep = daysToKeep;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static void main(String[] args) {
        Rose rose = new Rose();
        System.out.println(rose.getOrigin());


    }
}
