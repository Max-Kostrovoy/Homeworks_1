package com.company.lesson_3;

import java.util.Scanner;

public class SumOfTwoInt {

    private static int inputNumber(Scanner sc) {
        System.out.print("Please input a number : ");
        int num = 0;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("This is not an integer ! ");
            System.exit(0);
        }
        return num;
    }

    private static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = inputNumber(sc);
        Scanner sc2 = new Scanner(System.in);
        int num2 = inputNumber(sc2);
        System.out.println("Sum of numbers " + num1 + " and " + num2 + " is " + sum(num1, num2));
    }
}
