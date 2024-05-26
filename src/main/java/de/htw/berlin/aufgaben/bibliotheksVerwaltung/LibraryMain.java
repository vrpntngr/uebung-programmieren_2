package de.htw.berlin.aufgaben.bibliotheksVerwaltung;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("1234", "Java Programming", 3);
        library.addBook("5678", "Data Structures", 2);
        library.borrowBook("1234");
        library.printBookDetails("1234");
        library.returnBook("1234");
        library.printAllBooks();
    }
}
