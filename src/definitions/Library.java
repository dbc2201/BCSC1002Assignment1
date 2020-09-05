/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] books;

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
}
