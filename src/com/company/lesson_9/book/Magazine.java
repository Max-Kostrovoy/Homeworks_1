package com.company.lesson_9.book;

public class Magazine implements Printable {
    private String name;
    private int pageNumber;

    public Magazine() {
    }

    public Magazine(String magazine1) {

    }

    static Magazine[] magazines = new Magazine[3];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public void print() {
        System.out.println("The magazine's name is " + this.getName());
        System.out.println("This magazine has " + this.getPageNumber() + " pages");
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println(printable);
            }
        }
    }

    public static void main(String[] args) {
        /*Magazine[] magazines = new Magazine[3];
        Magazine magazine1 = new Magazine();
        magazine1.setName("");*/


    }
}
