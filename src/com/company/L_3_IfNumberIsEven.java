package com.company;

import java.util.Scanner;

public class L_3_IfNumberIsEven {

    private static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input an INTEGER : ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (isEven(num)) {
                System.out.println("The number " + num + " is EVEN");
            } else {
                System.out.println("The number " + num + " is NOT EVEN");
            }

        } else {
            System.out.println("This is not INTEGER !");
        }
    }
}
