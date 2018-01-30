package com.company.lesson_8.vehicles.details;

public class Engine {
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    private double power;

    public Engine(String manufacturer, double power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }
}
