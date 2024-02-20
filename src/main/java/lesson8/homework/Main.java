package lesson8.homework;

import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Suç ve Ceza", "Fyodor Dostoyevski", "Roman", 1866));
        library.addBook(new Book("Kürk Mantolu Madonna", "Sabahattin Ali", "Roman", 1943));
        library.addBook(new Book("İnce Memed", "Yaşar Kemal", "Roman", 1955));
        library.addBook(new Book("Saatleri Ayarlama Enstitüsü", "Ahmet Hamdi Tanpınar", "Roman", 1961));

        System.out.println("Search by title: " + library.searchBooks("Suç ve Ceza"));
        System.out.println("Search by author: " + library.searchBooks("Yaşar Kemal"));
        System.out.println("Search by genre: " + library.searchBooks("Roman"));

        System.out.println("\nSorted by title:");
        library.displaySortedBooks(Comparator.comparing(Book::getTitle));

        System.out.println("\nSorted by author:");
        library.displaySortedBooks(Comparator.comparing(Book::getAuthor));

        System.out.println("\nSorted by publication year:");
        library.displaySortedBooks(Comparator.comparingInt(Book::getPublicationYear));

        System.out.println("\nAverage publication year: " + library.calculateAveragePublicationYear());
        System.out.println("Number of books: " + library.countBooks());
    }
}


