package com.company.lesson_3;

public class TypeConvert {

    private static char byteToChar(byte x) {
        return (char) x;
    }

    private static short byteToShort(byte x) {
        return x;
    }

    private static int byteToInt(byte x) {
        return x;
    }

    private static long byteToLong(byte x) {
        return x;
    }

    private static float byteToFloat(byte x) {
        return x;
    }

    private static double byteToDouble(byte x) {
        return x;
    }

    private static char shortToChar(short x) {
        return (char) x;
    }

    private static byte shortToByte(short x) {
        return (byte) x;
    }

    private static int shortToInt(short x) {
        return x;
    }

    private static long shortToLong(short x) {
        return x;
    }

    private static float shortToFloat(short x) {
        return x;
    }

    private static double shortToDouble(short x) {
        return x;
    }

    private static char intToChar(int x) {
        return (char) x;
    }

    private static byte intToByte(int x) {
        return (byte) x;
    }

    private static short intToShort(int x) {
        return (short) x;
    }

    private static long intToLong(int x) {
        return x;
    }

    private static float intToFloat(int x) {
        return x;
    }

    private static double intToDouble(int x) {
        return x;
    }

    private static int charToInt(char x) {
        return x;
    }

    private static byte charToByte(char x) {
        return (byte) x;
    }

    private static short charToShort(char x) {
        return (short) x;
    }

    private static long charToLong(char x) {
        return x;
    }

    private static float charToFloat(char x) {
        return x;
    }

    private static double charToDouble(char x) {
        return x;
    }

    private static int longToInt(long x) {
        return (int) x;
    }

    private static byte longToByte(long x) {
        return (byte) x;
    }

    private static short longToShort(long x) {
        return (short) x;
    }

    private static char longToChar(long x) {
        return (char) x;
    }

    private static float longToFloat(long x) {
        return x;
    }

    private static double longToDouble(long x) {
        return x;
    }

    private static int floatToInt(float x) {
        return (int) x;
    }

    private static byte floatToByte(float x) {
        return (byte) x;
    }

    private static short floatToShort(float x) {
        return (short) x;
    }

    private static char floatToChar(float x) {
        return (char) x;
    }

    private static long floatToLong(float x) {
        return (long) x;
    }

    private static double floatToDouble(float x) {
        return x;
    }

    private static int doubleToInt(double x) {
        return (int) x;
    }

    private static byte doubleToByte(double x) {
        return (byte) x;
    }

    private static short doubleToShort(double x) {
        return (short) x;
    }

    private static char doubleToChar(double x) {
        return (char) x;
    }

    private static long doubleToLong(double x) {
        return (long) x;
    }

    private static float doubleToFloat(double x) {
        return (float) x;
    }

    public static void main(String[] args) {
        byte b = 97;
        short sh = 128;
        int i = 256;
        char ch = 'A';
        long lng = 1024;
        float f = 7.62f;
        double d = 12.7;

        System.out.println("----------------BYTE----------------");
        System.out.println("byte " + b + " is char " + byteToChar(b));
        System.out.println("byte " + b + " is int " + byteToInt(b));
        System.out.println("byte " + b + " is short " + byteToShort(b));
        System.out.println("byte " + b + " is long " + byteToLong(b));
        System.out.println("byte " + b + " is float " + byteToFloat(b));
        System.out.println("byte " + b + " is double " + byteToDouble(b));
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("---------------SHORT----------------");
        System.out.println("short " + sh + " is char " + shortToChar(sh));
        System.out.println("short " + sh + " is int " + shortToInt(sh));
        System.out.println("short " + sh + " is byte " + shortToByte(sh));
        System.out.println("short " + sh + " is long " + shortToLong(sh));
        System.out.println("short " + sh + " is float " + shortToFloat(sh));
        System.out.println("short " + sh + " is double " + shortToDouble(sh));
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("----------------INT-----------------");
        System.out.println("int " + i + " is char " + intToChar(i));
        System.out.println("int " + i + " is short " + intToShort(i));
        System.out.println("int " + i + " is byte " + intToByte(i));
        System.out.println("int " + i + " is long " + intToLong(i));
        System.out.println("int " + i + " is float " + intToFloat(i));
        System.out.println("int " + i + " is double " + intToDouble(i));
        System.out.println();
        System.out.println("----------------CHAR----------------");
        System.out.println("char " + ch + " is int " + charToInt(ch));
        System.out.println("char " + ch + " is short " + charToShort(ch));
        System.out.println("char " + ch + " is byte " + charToByte(ch));
        System.out.println("char " + ch + " is long " + charToLong(ch));
        System.out.println("char " + ch + " is float " + charToFloat(ch));
        System.out.println("char " + ch + " is double " + charToDouble(ch));
        System.out.println();
        System.out.println("----------------LONG----------------");
        System.out.println("long " + lng + " is int " + longToInt(lng));
        System.out.println("long " + lng + " is short " + longToShort(lng));
        System.out.println("long " + lng + " is byte " + longToByte(lng));
        System.out.println("long " + lng + " is char " + longToChar(lng));
        System.out.println("long " + lng + " is float " + longToFloat(lng));
        System.out.println("long " + lng + " is double " + longToDouble(lng));
        System.out.println();
        System.out.println("----------------FLOAT---------------");
        System.out.println("float " + f + " is int " + floatToInt(f));
        System.out.println("float " + f + " is short " + floatToShort(f));
        System.out.println("float " + f + " is byte " + floatToByte(f));
        System.out.println("float " + f + " is char " + floatToChar(f));
        System.out.println("float " + f + " is long " + floatToLong(f));
        System.out.println("float " + f + " is double " + floatToDouble(f));
        System.out.println();
        System.out.println("---------------DOUBLE---------------");
        System.out.println("double " + d + " is int " + doubleToInt(d));
        System.out.println("double " + d + " is short " + doubleToShort(d));
        System.out.println("double " + d + " is byte " + doubleToByte(d));
        System.out.println("double " + d + " is char " + doubleToChar(d));
        System.out.println("double " + d + " is long " + doubleToLong(d));
        System.out.println("double " + d + " is float " + doubleToFloat(d));
        System.out.println("------------------------------------");
    }
}
