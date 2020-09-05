/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private static final int DEFAULT_NUMBER_OF_BOOKS = 1000;
    private Book[] books;

    public void issueBook(long isbn) {
        System.out.println("Thank you, this book is now issued to you!");
        System.out.println("Happy Learning!");
    }

    public Library() {
        books = new Book[DEFAULT_NUMBER_OF_BOOKS];
        for (int i = 0, booksLength = books.length; i < booksLength; i++) {
            Book book = books[i];
            book = new Book(
                    "Book " + (i + 1),
                    "Author " + (i + 1),
                    "123456789101" + (i + 1));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Library library = (Library) o;
        return Arrays.equals(getBooks(), library.getBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooks());
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder bookList = new StringBuilder();
        for (Book book : this.getBooks()) {
            bookList.append(book.toString());
            bookList.append("-----");
        }
        return bookList.toString();
    }

    public void returnBook(long isbn) {
        System.out.println("Thank you for returning this book.");
    }
}
