package com.company;

public class L_5_Arrays {

    public static void printLast(String[] args) {
        System.out.println(args[args.length - 1]);
    }

    public static void printFirstDouble(double[] args) {
        System.out.println(args[0]);
    }

    public static void main(String[] args) {
        String argsOne[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        printLast(argsOne);

        double argsTwo[] = new double[4];
        argsTwo[0] = 3.14;
        argsTwo[1] = 12.7;
        argsTwo[2] = 7.62;
        argsTwo[3] = 5.45;

        printFirstDouble(argsTwo);
    }
}
