package com.company.lesson_4;

public class PrintTheOdd {

    public static boolean checkInt(String str) throws NumberFormatException {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkOdd(int x) {
        if (x % 2 != 0) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        for (String str : args) {
            if (checkInt(str) == true) {
                int num = Integer.parseInt(str);
                if (checkOdd(num) == true) {
                    System.out.println("The number... " + num + " ...is odd");
                } else System.exit(0);
            } else {
                System.out.println("Incorrect input !");
            }
        }
    }
}
