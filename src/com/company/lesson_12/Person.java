package com.company.lesson_12;

public class Person {
    String fullName;
    int age;

    public void move() {
        System.out.println("Person is moving...");
    }

    public void talk() {
        System.out.println("Person is talking...");
    }

    public String toString(Person person) {
        String str = String.format("Mister %s is %s years old", person.fullName, person.age);
        return str;
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
        System.out.println(client2.toString(client2));
    }
}
