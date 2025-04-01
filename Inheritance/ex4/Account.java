package assignments.Inheritance.ex4;

public class Account {
    public int no_borrowed_books=0;
    public int no_reserved_books=0;
    public int no_returned_books=0;
    public int no_lost_books=0;
    public int fine_amount=0;

    public Account() {

    }

    void calculateFine()
    {
        System.out.println("calculating Fine");
    }
void displayAccountDetails() {
    System.out.println("Account Details:");
    System.out.println("Borrowed Books: " + no_borrowed_books);
    System.out.println("Reserved Books: " + no_reserved_books);
    System.out.println("Returned Books: " + no_returned_books);
    System.out.println("Lost Books: " + no_lost_books);
    System.out.println("Fine Amount: " + fine_amount);
}
}
