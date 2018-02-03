package com.company.lesson_12;

public class StringMiddle {

    public static StringBuilder stringMiddle(String str) {
        StringBuilder result = new StringBuilder();
        if (str.length() % 2 == 0) {
            result.append(str.charAt(str.length() / 2));
            result.append(str.charAt((str.length() / 2) + 1));
        } else {
            System.out.println("ERROR! Number of letters MUST be odd!");
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "computer";
        String str2 = "notebooks";
        System.out.println(stringMiddle(str));
        System.out.println(stringMiddle(str2));
    }
}
