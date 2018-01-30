package com.company.lesson_7;

import com.company.lesson_7.Reader;

public class Library {

    public Library() {

    }

    public static void main(String[] args) {
        Library myLib = new Library();
        Reader reader1 = new Reader("Ivan Petrov", 101, "Physical",
                123456);
        Reader reader2 = new Reader("Sergey Ivanov", 102, "Chemical",
                223456);
        Reader reader3 = new Reader("Valeriy Sergeev", 103, "Mathematical",
                334567);
        Reader[] readers = new Reader[3];
        readers[0] = reader1;
        readers[1] = reader2;
        readers[2] = reader3;

        Book book1 = new Book("Jack London", "Martin Eden");
        Book book2 = new Book("Gaston Leroux", "The Phantom of the Opera");
        Book book3 = new Book("Mark Twain", "The Tom Sawyer's Adventures");

        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        myLib.takeBook(2);
        myLib.takeBook(books[0]);
        myLib.takeBook(book1, book2, book3);
    }

    public void takeBook(int bookNumber) {
        System.out.println("Ivan Petrov took " + bookNumber + " books");
    }

    public void takeBook(Book book) {
        System.out.println("Ivan Petrov took " + book.getName());
    }

    public void takeBook(Book... b) {
        for (Book thisBook : b) {
            System.out.println("Ivan Petrov took " + thisBook.getName());
        }
    }
}
