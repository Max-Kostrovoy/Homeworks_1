package com.company.lesson_8.Animal.src;

public class Animal {
    private String food;
    private String location;
    private String noise;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println(noise);
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public void sleep() {
        System.out.println("Zzzzzz");
    }

    public Animal(String food, String location, String noise) {
        this.food = food;
        this.location = location;
        this.noise = noise;
    }
}
