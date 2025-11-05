package org.school;

import pl.wmii.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book();

        books[1] = new Book();
        books[2] = new Book();
        for (var elem : books){
            elem.setTitle("A");
        }
        ArrayList<Book> books2 = new ArrayList<>();
        books2.add(new Book());
        books2.add(new Book());
        for (var elem : books2){
            elem.setTitle("B");
        }
        books[0].setPrice(100);
        Book  b3 = books[0].doublePrice();
        System.out.println(b3.getPrice());
        System.out.println(b3);
        System.out.println(b3.toString());
    }
}
