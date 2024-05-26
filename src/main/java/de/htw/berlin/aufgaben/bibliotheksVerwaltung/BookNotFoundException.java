package de.htw.berlin.aufgaben.bibliotheksVerwaltung;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message) {
        super(message);
    }
}
