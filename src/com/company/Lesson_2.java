package com.company;

public class Lesson_2 {

    //This method returns the sum of two arguments

    private static int sum(int x, int y) {
        return (x + y);
    }

    public static void main(String[] args) {

        /*Below are examples of
        different data types*/

        boolean b = true;
        String str = "hello";
        char c = 'x';
        int i2 = 0b111;
        int i8 = 005;
        int i10 = 75;
        int i16 = 0xffd;
        float f = 32.78f;
        double d = .386;

        /*These literals would be
        printed in command line*/

        System.out.println(b);
        System.out.println(str);
        System.out.println(c);
        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i10);
        System.out.println(i16);
        System.out.println(f);
        System.out.println(d);

        int x = 256;
        int y = 512;

        /*Here would be printed the sum of arguments X and Y*/

        System.out.println("Sum of " + x + " and " + y + " is " + sum(x, y));
    }
}
