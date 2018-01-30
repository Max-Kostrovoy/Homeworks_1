package com.company.lesson_7;

import java.util.Scanner;

public class FromAToB {
    int a, b;

    public static void printIncrease(int a, int b) {
        while (a < b + 1) {
            System.out.print(a++ + " ");
        }
    }

    public static void printDecrease(int a, int b) {
        while (a > b - 1) {
            System.out.print(a-- + " ");
        }
    }

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

    public static void checkAndPrint(int num1, int num2) {
        if (num1 < num2) {
            printIncrease(num1, num2);
        } else if (num1 > num2) {
            printDecrease(num1, num2);
        } else {
            System.out.println("Numbers are equal ! ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = inputNumber(sc);
        Scanner sc2 = new Scanner(System.in);
        int num2 = inputNumber(sc2);

        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

        checkAndPrint(num1, num2);
    }
}
