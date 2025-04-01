package assignments.Inheritance.ex4;

public class Book {
    private String title;
    private String Author;
    private String ISBN;
    private String publication;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public Book(String title, String author, String ISBN, String publication) {
        this.title = title;
        this.Author = author;
        this.ISBN = ISBN;
        this.publication = publication;
    }
    public void  showDueDate()
    {
        System.out.println("Showing due date");
    }
    public void reservationStatus()
    {
        System.out.println("checking reservation status");
    }
    public void Feedback()
    {
        System.out.println("Please provide the feedback");
    }
    public void book_Request()
    {
        System.out.println("providing the book request");
    }
    public void renw_info() {
        System.out.println("Providing the renewal information");
    }


}
