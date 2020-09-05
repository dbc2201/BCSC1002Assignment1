/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String name;
    private String authorName;
    private String isbn;

    public Book(String name, String authorName, String isbn) {
        this.name = name;
        this.authorName = authorName;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(getName(), book.getName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getIsbn(), book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthorName(), getIsbn());
    }

    @Override
    public String toString() {
        return String.format(
                "Book Name: '%s'.\n" +
                        "Author Name: '%s'.\n" +
                        "ISBN Number: '%s'.",
                this.getName(), this.getAuthorName(), this.getIsbn()
        );
    }
}
