package lesson8.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchBooks(String keyword) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(keyword) ||
                        book.getAuthor().equalsIgnoreCase(keyword) ||
                        book.getGenre().equalsIgnoreCase(keyword))
                .collect(Collectors.toList());
    }

    public void displaySortedBooks(Comparator<Book> comparator) {
        books.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    public double calculateAveragePublicationYear() {
        return books.stream()
                .mapToInt(Book::getPublicationYear)
                .average()
                .orElse(0);
    }

    public int countBooks() {
        return books.size();
    }
}
