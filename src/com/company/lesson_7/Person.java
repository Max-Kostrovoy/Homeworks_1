package com.company.lesson_7;

public class Person {
    String fullName;
    int age;

    public void move() {
        System.out.println("Person is moving...");
    }

    public void talk() {
        System.out.println("Person is talking...");
    }

    Person() {
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person client1 = new Person();
        Person client2 = new Person("Bill Gates", 62);

        client2.talk();
    }
}
