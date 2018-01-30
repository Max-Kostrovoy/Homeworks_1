package com.company.lesson_5;

public class MultiStringArray {


    public static void main(String[] args) {
        String[][] arr1 = new String[3][6];
        arrFill(arr1);
        arrPrint(arr1);
    }

    public static void arrFill(String arr[][]) {
        int x = 97;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Character.toString((char) x) + Integer.toString(j + 1) + " ";
            }
            x++;
        }
    }

    public static void arrPrint(String arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
