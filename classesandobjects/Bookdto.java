package assignments.classesandobjects;

public class Bookdto {
    String title;
    String author;
    String isbn;
    static int no_of_books=0;
    Bookdto(String title,String author,String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        no_of_books+=1;
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
    public boolean isvalidISBN()
    {
        return isbn!=null&&(isbn.length()==10||isbn.length()==13);
    }

    public static void main(String[] args) {
        Bookdto book1=new Bookdto("The Great Gatsby", "F.Scott Fitzgerald", "9780743273565");
        Bookdto book2=new Bookdto("Clean Code", "Robert C.Martin", "9780132350884");
        Bookdto book3=new Bookdto("A Brief History of Time", "Stephen Hawking", "9780553380163");
        //System.out.println(book1.getTitle());
        book1.getInfo();
        book2.getInfo();
        book3.getInfo();
        System.out.println(book1.isvalidISBN());

    }
}
