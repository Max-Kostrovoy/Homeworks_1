package com.company;

import java.util.Arrays;

public class L_5_SortAndPrint {
    public static void sortBubbleIncrease(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void arrFillInt(int arr[][]) {
        //int[][] a=new int[5][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void arrFindMinMax(int arr[][]) {
        int[] tmp = new int[arr[0].length];
        int[][] result = new int[5][2];
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, tmp, 0, arr[i].length);
            System.out.println(Arrays.toString(tmp));
            sortBubbleIncrease(tmp);
            System.out.println(Arrays.toString(tmp));
            System.out.println(tmp[0] + " " + tmp[tmp.length - 1]);
            result[i][1] = tmp[0];
            result[i][0] = tmp[tmp.length - 1];
            System.out.println();
        }
        System.out.println(Arrays.toString(result));
    }

    public static void arrPrint(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] raw = new int[5][8];
        arrFillInt(raw);
        arrPrint(raw);
        System.out.println();
        arrFindMinMax(raw);
    }
}
