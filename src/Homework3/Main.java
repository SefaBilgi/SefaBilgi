package Homework3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1234, "Test", new Author(2343, "Jessi", "Test"), new Publisher(6578, "Kemal", "Denizli"), 1999, true),
                new Book(12342342, "Test2", new Author(234343, "Jessica", "Yilmaz"), new Publisher(65784, "Mehmet", "Ankara"), 2000, true),
                new Book(1234212, "Test3", new Author(234366, "JessicaJes", "John"), new Publisher(6574, "Sefa", "Istanbul"), 1998, true),
                new Book(123466, "Test4", new Author(234323, "Sefa", "Akan"), new Publisher(65786, "Ekrem", "Usak"), 1993, false),
                new Book(1234009, "Test5", new Author(234376, "Sefa", "Bilgi"), new Publisher(5645, "Sakir", "Mugla"), 1994, false),

        };
        System.out.println(filterByISBN(books, 1234));
    }

    public static ArrayList<Book> filterByISBN(Book[] books, int value) {
        ArrayList<Book> booksToReturn = new ArrayList<Book>();

        for (Book book : books) {
            if (book.isbn == value) {
                booksToReturn.add(0, book);
            }
        }
        return booksToReturn;
    }
}
