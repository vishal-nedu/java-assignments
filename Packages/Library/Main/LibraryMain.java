package assignments.Packages.Library.Main;

import assignments.Packages.Library.Books.Book;
import assignments.Packages.Library.Books.BookObj;
import assignments.Packages.Library.Members.Member;
import assignments.Packages.Library.Members.Memberobj;
import assignments.Packages.Library.Transactions.Transaction;
import assignments.Packages.Library.Transactions.TransactionObj;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1=new Book("To kill a Mocking bird","Haper Lee","12");
        Book book2=new Book("1984","George Orwell","13");
        Book book3=new Book("The Alchemist","Paulo coelho","15");
        BookObj bo=new BookObj();
        bo.addbook(book1);
        bo.addbook(book2);
        bo.addbook(book3);
        bo.displaybooks();

        Member member1=new Member("Rudra","9878899202","rud@gmail.com");
        Member member2=new Member("Mithran","9899267392","mithran@gmail.com");
        Member member3=new Member("Bala","9888773629","bala@gmail.com");
        Memberobj mo=new Memberobj();
        mo.addmember(member1);
        mo.addmember(member2);
        mo.addmember(member3);
        mo.displayMembers();
        Transaction t1=new Transaction(book2,member1,"26 Apr 2025","6 May 2025");
        TransactionObj to=new TransactionObj();
        to.addTransaction(t1);
        to.displayTransactions();

    }
}
