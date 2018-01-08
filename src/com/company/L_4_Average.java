package com.company;

public class L_4_Average {

    private static void accumulator(String[] args) {
        double sum = 0;
        int counter = 0;

        for (String str : args) {
            sum += Double.parseDouble(str);
            ++counter;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Counter = " + counter);
        System.out.println("Average for these numbers is : " + sum / counter);
    }

    public static void main(String[] args) {
        System.out.println("Please input some numbers, after input press ENTER : ");

        if (args.length > 0) {
            accumulator(args);
        } else {
            System.out.println("There are NO arguments !");
            System.exit(0);
        }

    }
}