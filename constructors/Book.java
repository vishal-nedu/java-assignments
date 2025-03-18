package assignments.constructors;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private static int no_of_books=0;
    private static ArrayList<Book> arr=new ArrayList<>();
    Book(String title, String author, String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        no_of_books+=1;
        arr.add(this);
    }
    public String getTitle()
    {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public static int getNo_of_books() {
        return no_of_books;
    }
    public void getInfo()
    {
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("ISBN No:"+isbn);

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public boolean isvalidISBN()
    {
        return isbn!=null&&(isbn.length()==10||isbn.length()==13);
    }

    public static void main(String[] args) {
        Book book1=new Book("The Great Gatsby", "F.Scott Fitzgerald", "9780743273565");
        Book book2=new Book("Clean Code", "Robert C.Martin", "9780132350884");
        Book book3=new Book("A Brief History of Time", "Stephen Hawking", "9780553380163");
        book1.getInfo();
        book2.getInfo();
        book3.getInfo();
        System.out.println(book1.isvalidISBN());
       for(Book b:arr)
       {
           System.out.println(b.toString());
       }

    }
}
