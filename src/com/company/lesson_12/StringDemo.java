package com.company.lesson_12;

public class StringDemo {
    public static void stringLast(String args) {
        System.out.println("Last symbol is : " + args.charAt(args.length() - 1));
    }

    public static void checkEnd(String args, String example) {
        if (args.endsWith(example)) {
            System.out.println("String " + args + " ends with " + example);
        } else {
            System.out.println("False!");
        }
    }

    public static void checkStart(String args, String example) {
        if (args.startsWith(example)) {
            System.out.println("String " + args + " starts with " + example);
        } else {
            System.out.println("False!");
        }
    }

    public static String replaceLetter(String str, char oldLetter, char newLetter) {
        str = str.replace(oldLetter, newLetter);
        return str;
    }

    public static String toUpper(String str) {
        str = str.toUpperCase();
        return str;
    }

    public static String toLower(String str) {
        str = str.toLowerCase();
        return str;
    }

    public static String cropOff(String str, int index) {
        str = str.substring(0, index);
        return str;
    }


    public static void main(String[] args) {
        String str = "I like Java!!!";
        String checkEnd = "!!!";
        String checkStart = "I like";
        stringLast(str);
        checkEnd(str, checkEnd);
        checkStart(str, checkStart);
        System.out.println(replaceLetter(str, 'a', 'o'));
        System.out.println(cropOff(str, 7));
    }
}
