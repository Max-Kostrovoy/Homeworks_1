package com.company;

import java.util.Arrays;

public class L_5_ArraySort {

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

    public static void sortBubbleDecrease(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr3 = {1, 2, 3, 7, 6, 5, 8, 9, 0};
        System.out.println(Arrays.toString(arr3));
        //System.out.println(arr3.length);
        sortBubbleIncrease(arr3);
        System.out.println(Arrays.toString(arr3));
        sortBubbleDecrease(arr3);
        System.out.println(Arrays.toString(arr3));
    }

}
