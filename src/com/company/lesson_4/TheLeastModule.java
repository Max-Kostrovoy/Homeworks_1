package com.company.lesson_4;

import java.util.Scanner;

public class TheLeastModule {

    private static boolean flag = true;

    private static double checkType(Scanner num) {
        double res = 0;
        if (num.hasNextInt()) {
            res = num.nextInt();
        } else {
            if (num.hasNextDouble()) {
                res = num.nextDouble();
            } else {
                System.out.println("This is not a NUMBER !");
                flag = false;
            }
        }
        return res;
    }

    private static double findModule(double x) {
        double mod = Math.abs(x);
        return mod;
    }

    private static double compare(double x, double y, double z) {
        double min = 0;
        if ((x <= y) && (x < z)) {
            min = x;
        } else if (y < x && y <= z) {
            min = y;
        } else if ((z <= x) && (z < y)) {
            min = z;
        } else if ((x == y) && (x == z)) {
            System.out.println("Modules are equal !");
            System.exit(0);
        }
        return min;
    }

    public static void main(String[] args) {
        double num1, num2, num3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a FIRST NUMBER : ");

        num1 = checkType(sc);
        //checkFlag(flag);


        if (flag == true) {
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Please input SECOND NUMBER : ");

            num2 = checkType(sc2);

            if (flag == true) {
                Scanner sc3 = new Scanner(System.in);
                System.out.print("Please input THIRD NUMBER : ");

                num3 = checkType(sc3);

                double result = compare(findModule(num1), findModule(num2), findModule(num3));
                System.out.println("The least module is " + result);
            }
        }
    }
}