package com.company.lesson_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFinder {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c*ab");
        Matcher matcher = pattern.matcher("cccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}