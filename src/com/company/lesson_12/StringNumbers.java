package com.company.lesson_12;

public class StringNumbers {

    public static StringBuilder sumString(int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        sb.append(num1);
        sb.append(" + ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 + num2);

        return sb;
    }

    public static StringBuilder differenceString(int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        sb.append(num1);
        sb.append(" - ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 - num2);

        return sb;
    }

    public static StringBuilder productString(int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        sb.append(num1);
        sb.append(" * ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 * num2);

        return sb;
    }

    public static StringBuilder changeString1(StringBuilder sb) {
        sb.insert(sb.indexOf("="), "равно");
        sb.deleteCharAt(sb.indexOf("="));
        return sb;
    }

    public static StringBuilder changeString2(StringBuilder sb) {
        sb.replace(sb.indexOf("=") - 1, sb.indexOf("=") + 1, " равно");
        return sb;
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;
        System.out.println(sumString(num1, num2));
        System.out.println(differenceString(num1, num2));
        System.out.println(productString(num1, num2));
        System.out.println(changeString1(sumString(num1, num2)));
        System.out.println(changeString2(differenceString(num1, num2)));
    }
}