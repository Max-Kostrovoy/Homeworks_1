package com.company.lesson_12;

public class StudentInfo {
    public static void studentInfo(String surname, double mark, String subject) {
        System.out.println(String.format("Студент %s получил %s по %s", surname, mark, subject));
    }

    public static void main(String[] args) {
        studentInfo("Петров", 5, "математике");
    }
}
