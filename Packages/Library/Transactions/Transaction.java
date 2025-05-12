package assignments.Packages.Library.Transactions;

import assignments.Packages.Library.Books.Book;
import assignments.Packages.Library.Members.Member;

public class Transaction
{
    private Book book;
    private Member member;
    private String issueDate;
    private String duedate;

    public Transaction(assignments.Packages.Library.Books.Book book2, Member member, String issueDate, String duedate) {
        this.book = book2;
        this.member = member;
        this.issueDate = issueDate;
        this.duedate = duedate;
    }


    public assignments.Packages.Library.Books.Book getBook() {
        return book;
    }

    public void setBook(assignments.Packages.Library.Books.Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "book=" + book +
                ", member=" + member +
                ", issueDate='" + issueDate + '\'' +
                ", duedate='" + duedate + '\'' +
                '}';
    }
}
