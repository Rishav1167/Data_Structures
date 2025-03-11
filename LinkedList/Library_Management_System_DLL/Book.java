package LinkedList.Library_Management_System_DLL;

public class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next;
    Book prev;

    // Constructor
    public Book(String title, String author, String genre, int bookId) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = true; // By default, a book is available
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Genre: " + genre +
                ", Availability: " + (isAvailable ? "Available" : "Not Available");
    }
}
