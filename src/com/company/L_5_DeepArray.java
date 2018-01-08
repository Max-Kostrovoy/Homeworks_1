package com.company;

import java.util.Arrays;

public class L_5_DeepArray {

    public static void arrPrint(String arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] arr2 = {{"ab", "cd"}, {"e1", "f1"}, {"g2", "h2"}, {"i3", "j3"}};
        arrPrint(arr2);
        System.out.println("-----------");
        System.out.println(Arrays.deepToString(arr2));
    }
}

