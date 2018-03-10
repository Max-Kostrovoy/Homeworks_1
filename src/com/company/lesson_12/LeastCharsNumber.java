package com.company.lesson_12;

public class LeastCharsNumber {

    private static void leastChars(String str) {
        String[] min = str.split(" ");
        StringBuilder resultWord = new StringBuilder();
        String out;
        int numberOfChars, numberOfChars1 = str.length();
        for (String word : str.split(" ")) {
            numberOfChars = 0;
            resultWord.setLength(0);
            for (String ch : word.split("")) {
                out = String.valueOf(ch);
                if (resultWord.indexOf(out) == -1) {
                    resultWord.append(out);
                    numberOfChars++;
                }
            }
            if (numberOfChars < numberOfChars1) {
                numberOfChars1 = numberOfChars;
                min[0] = word;
            }
        }
        System.out.println(min[0]);
    }

    public static void main(String[] args) {
        String str = "This is the string sample for search a word with the least symbol number";
        System.out.print("Initial string: " + str + "\nWord with the least symbol number: ");
        leastChars(str);
    }
}