package com.company;

import com.company.Books.Book;

public class Main {
    public static void main(String[] args) {
        Book book=new Book("Алгебра", "коричневый", 220, 9);
        System.out.println("Предмет "+book.name+ " свет книги " +book.colour+ ", " +book.page+"стр. "+book.clas+"класс");

        Book books=new Book("География", "белый", 150, 10);
        System.out.println("Предмет "+books.name+ " свет книги " +books.colour+ ", " +books.page+ "стр. " +books.clas+"класс");

    }
}
