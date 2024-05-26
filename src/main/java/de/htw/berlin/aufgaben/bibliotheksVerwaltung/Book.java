package de.htw.berlin.aufgaben.bibliotheksVerwaltung;

public class Book {

    String title;
    int copies;

    Book(String title, int copies) {
        this.title = title;
        this.copies = copies;
    }

    @Override
    public String toString() {
        return title + ", Copies: " + copies;
    }
}
