package com.company;

import java.util.Scanner;

public class L_5_Garland {
    public static void choice() {
        int numb = (int) (Math.random() * 40);
        System.out.println("Random number is: " + numb);

        System.out.println("Please choose the mode:");
        System.out.println("For blinking type '1'");
        System.out.println("For hide type '2'");
        System.out.println("For reverse type '3'");
        System.out.println("For current state type '4'");
        System.out.print("Your choice : ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    blink(numb);
                    break;
                case 2:
                    hide(numb);
                    break;
                case 3:
                    reverse(numb);
                    break;
                case 4:
                    currentState(numb);
                    break;
                default:
                    System.out.println("Your input is incorrect!");
            }
        } else {
            System.out.println("Your input is incorrect!");
        }
    }

    public static void main(String[] args) {
        choice();
    }

    public static void blink(int i) {
        System.out.println(i);
        String bin = Integer.toBinaryString(i);
        System.out.println(bin);
        int binNum = Integer.parseInt(bin);
        for (int n = 0; n < 4; n++) {
            binNum = ~binNum;
            System.out.println(Integer.toBinaryString(binNum));
        }
    }

    public static void hide(int i) {
        for (int n = 0; n < 4; n++) {
            i = i >> 1;
            System.out.println(Integer.toBinaryString(i));
        }
    }

    public static void reverse(int i) {
        int k = i & 1;
        System.out.println(Integer.toBinaryString(k));
        if (Integer.toBinaryString(k).equals(0)) {
            System.out.println("The lamp is OFF");
        } else {
            System.out.println("The lamp is ON");
        }

    }

    public static void currentState(int i) {
        System.out.print(Integer.toBinaryString(i));
    }
}