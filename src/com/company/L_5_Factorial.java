package com.company;

public class L_5_Factorial {
    public static int factorial(int x) {
        int fact = 1;
        if (x == 0) {
            fact = 1;
        } else {
            for (int i = 1; i < x + 1; i++) {
                fact *= i;
            }
        }

        return fact;
    }

    public static void main(String[] args) {
        int numb = (int) (Math.random() * 256);
        System.out.println("Random number is: " + numb);
        System.out.println("Factorial of number " + numb + " is " + factorial(numb));
    }
}
