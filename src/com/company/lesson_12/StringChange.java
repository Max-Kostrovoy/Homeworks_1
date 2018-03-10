package com.company.lesson_12;

public class StringChange {
    private static void replaceTargetString(String s, String target) {
        System.out.println(s);
        System.out.println((s.toLowerCase()).replace(target, "OOP"));
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("This text contains the information about object oriented programming" +
                " and you could try the Object Oriented Programming right now!");
        String target = "object oriented programming";
        replaceTargetString(s.toString(), target);
    }
}