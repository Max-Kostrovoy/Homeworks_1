package com.company.lesson_9.book;

public class printDemo {

    public static void main(String[] args) {
        Book book = new Book("book1");
        Magazine magazine = new Magazine("magazine1");

        Printable[] printables = {book, magazine};
        Magazine.printMagazines(printables);
    }
}
