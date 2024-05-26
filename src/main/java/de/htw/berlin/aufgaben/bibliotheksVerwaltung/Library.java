package de.htw.berlin.aufgaben.bibliotheksVerwaltung;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private final Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(String isbn, String title, int copies) {
        books.put(isbn, new Book(title, copies));
    }

    public void updateBook(String isbn, int newCopies) {
        try {
            Book book = getBook(isbn);
            book.copies = newCopies;
        } catch (BookNotFoundException e) {
            System.out.println("Book not found!");
        }
    }

    public void borrowBook(String isbn) {
        try {
            Book book = getBook(isbn);
            borrowBooks(book);
        } catch (BookNotFoundException e) {
            System.out.println("Book not found!");
        }
    }

    private void borrowBooks(Book book) {
        if (book.copies > 0) {
            book.copies--;
        } else {
            System.out.println("Book not available!");
        }
    }

    public void returnBook(String isbn) {
        try {
            Book book = books.get(isbn);
            returnBook(book);
        } catch (BookNotFoundException e) {
            System.out.println("Book not found!");
        }
    }

    private void returnBook(Book book) {
        if (book != null) {
            book.copies++;
        } else {
            System.out.println("Book not found!");
        }
    }

    public void printBookDetails(String isbn) {
        try {
            Book book = books.get(isbn);
            System.out.println(book);
        } catch (BookNotFoundException e) {
            System.out.println("Book not found!");
        }
    }

    public void printAllBooks() {
        books.forEach((isbn, book) -> System.out.println(isbn + ": " + book));
    }

    private Book getBook(String isbn) throws BookNotFoundException {
        if (books.containsKey(isbn)) {
            return books.get(isbn);
        } else {
            throw new BookNotFoundException("No book found with ISBN " + isbn);
        }
    }
}