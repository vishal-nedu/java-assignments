package assignments.Packages.Library.Books;

import java.util.ArrayList;
import java.util.List;

public class BookObj
{
    List<Book> booklist=new ArrayList<>();
    public void addbook(Book book)
    {
        booklist.add(book);
    }
    public void displaybooks()
    {
        for(Book book:booklist)
        {
            System.out.println(book);
        }
    }
}
