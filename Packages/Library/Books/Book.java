package assignments.Packages.Library.Books;

public class Book {
    String bookname;
    String authorname;
    String isbn;

    public Book(String bookname, String authorname, String isbn) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.isbn = isbn;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", authorname='" + authorname + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
