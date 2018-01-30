package com.company.lesson_9.shape;

public class Prime {
    public static void main(String[] args) {
        for (long i = 1; i <= 100000000000000000L; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isPrimeNumber(long i) {
        long factors = 0;
        long j = 1;

        while (j <= i) {
            if (i % j == 0) {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }
}