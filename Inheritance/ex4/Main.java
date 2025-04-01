package assignments.Inheritance.ex4;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem ls=new LibraryManagementSystem();
        LibraryDatabase database=new LibraryDatabase();
        Librarian librarian=new Librarian();
        Staff staff=new Staff("John","101","IT");
        Student student=new Student("Rudra","201","IT");
        Book book1=new Book("The great Gatsby","F.Scott Fitxgerald","1234555","Scribner");
        Book book2=new Book("1984","George Orwell","87776768","Harcourt");
        student.account.no_borrowed_books=1;
        student.account.no_reserved_books=2;
        student.account.no_returned_books=0;
        student.account.no_lost_books=0;
        student.account.fine_amount=20;
        student.checkaccount();
        database.add(book1);
        database.add(book2);
        database.display();
        librarian.verify();
        librarian.search(database,"1984");



    }
}
