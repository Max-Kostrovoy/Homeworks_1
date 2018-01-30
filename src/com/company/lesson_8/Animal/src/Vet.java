package com.company.lesson_8.Animal.src;

public class Vet {

    public static void treatAnimal(Animal animal) {
        System.out.println("The food is " + animal.getFood());
        System.out.println("The location is " + animal.getLocation());
    }

    public static void treatAnimal(Animal[] animals) {
        for (Animal newAnimal : animals) {
            treatAnimal(newAnimal);
        }
    }

    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        Cat cat = new Cat("mouse", "tree", "Meow!");
        Dog dog = new Dog("meat", "yard", "Woof!");
        animals[0] = cat;
        animals[1] = dog;

        treatAnimal(cat);
        System.out.println("======");
        treatAnimal(animals);
    }
}
