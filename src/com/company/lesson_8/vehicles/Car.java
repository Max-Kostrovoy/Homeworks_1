package com.company.lesson_8.vehicles;


import com.company.lesson_8.vehicles.professions.Driver;
import com.company.lesson_8.vehicles.details.Engine;

public class Car {
    private String name;
    private String type;
    private int weight;
    Engine engine;
    Driver driver;

    public Car() {
        this.engine = new Engine("GM", 95);
        this.driver = new Driver("Ivan Petrov", 15);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnLeft() {
        System.out.println("Поворот налево...");
    }

    public void turnRight() {
        System.out.println("Поворот направо...");
    }

    public void printInfo() {
        System.out.println("name : " + name);
        System.out.println("type : " + type);
        System.out.println("weight : " + weight + " kg");
        System.out.println("engine: " + engine.getManufacturer() + " , with power " + engine.getPower());
        System.out.println("driver : " + driver.getName() + " , his experience is " + driver.getExperience());
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setName("Ford");
        myCar.setType("Coupe");
        myCar.setWeight(950);
        myCar.printInfo();
        myCar.turnRight();
    }
}