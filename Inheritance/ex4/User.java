package assignments.Inheritance.ex4;

public class User  {
    private String name;
    private String id;
    Account account;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.account = new Account();
    }

    void checkaccount()
    {
        System.out.println("checking account");
        account.displayAccountDetails();
    }
}
