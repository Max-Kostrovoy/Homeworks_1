package com.company.lesson_8.vehicles.professions;

public class Driver {
    private String name;
    private double experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Driver(String name, double experience) {
        this.name = name;
        this.experience = experience;
    }
}
