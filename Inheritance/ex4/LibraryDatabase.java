package assignments.Inheritance.ex4;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase{
    private static List<Book> listofbooks=new ArrayList<>();
    public void add(Book book)
    {
        listofbooks.add(book);
    }
    public void delete(Book book)
    {
        listofbooks.remove(book);
    }
    public void update(Book newbook,Book oldbook)
    {
        listofbooks.remove(oldbook);
        listofbooks.add(newbook);
    }

   public void search(String title)
   {
       for(Book book:listofbooks)
       {
           if(book.getTitle()==title)
           {
               System.out.println("Book found");
           }
       }
   }
   public void display()
   {
       for(Book book:listofbooks)
       {
           System.out.println("book:"+book.getTitle()+ " by " +book.getAuthor());
       }
   }
}
