package com.company.lesson_8.Student;

public class Aspirant extends Student {
    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;

    }

    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Ivan", "Petrov", "IF60", 9.7);
        Aspirant aspirant = new Aspirant("Ivan1", "Petrov1", "IF601", 9.71, "Work1");
        Student aspirant2 = new Aspirant("Ivan2", "Petrov2", "IF602", 9.72, "Work2");

        Student[] students = {student, aspirant, aspirant2};

        for (Student student1 : students) {
            System.out.println(student1.getScholarship());
        }
    }

}
