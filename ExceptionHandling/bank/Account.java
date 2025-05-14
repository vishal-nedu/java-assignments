package assignments.ExceptionHandling.bank;

public class Account
{
    private String AccountNumber;
    private String holderName;
    private double balance;

    public Account(String accountNumber, String holderName, double balance) {
        AccountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println(amount +"deposited. New Balance:"+balance);
    }
    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if(amount>balance)
        {
            throw  new InsufficientBalanceException("Insufficient balance! Available:"+balance);
        }
        balance-=amount;
        System.out.println(amount+"withdrawn the available balance is:"+balance);
    }
    public double getBalance()
    {
        return balance;
    }
    public void showdetails()
    {
        System.out.println("Account No"+AccountNumber);
        System.out.println("Holder name:"+holderName);
        System.out.println("Available Balance:"+balance);
    }
}
