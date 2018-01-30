package com.company.lesson_9.book;

public class Book implements Printable {

    private String name;
    private int pageNumber;

    public Book() {
    }

    public Book(Book[] books) {
        this.books = books;
    }

    static Book[] books = new Book[3];

    public Book(String book1) {

    }

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

    public void print() {
        System.out.println("The book's name is " + this.getName());
        System.out.println("This book has " + this.getPageNumber() + " pages");
    }

    public Printable[] printables = new Printable[3];

    public void importBooks(Book[] books) {
        for (Printable printable : printables) {
            for (Book book : books) {
                printable = book;
            }
        }
    }

    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                System.out.println(printable);
            }
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setName("White fang");
        book1.setPageNumber(375);

        Book book2 = new Book();
        Book book3 = new Book();

        books[0] = book1;


    }
}

