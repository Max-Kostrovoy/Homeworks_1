package com.company.lesson_5;

public class DivideByFive {

    private static void checkDivision(int number, int target) {
        if (number % target == 0) {
            System.out.println(number + " ");
        }
    }

    public static void main(String[] args) {
        int x = 1;
        int div = 5;

        do {
            checkDivision(x, div);
            x++;
        } while (x <= 100);
    }
}
