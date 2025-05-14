package assignments.ExceptionHandling.bank;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account acc1=new Account("767282cnb","vijayamalaiya",5000);
        acc1.showdetails();
        try
        {
            System.out.println("Enter amount to withdraw:");
            double amount=sc.nextDouble();
            acc1.withdraw(amount);
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println("Transaction failed:"+e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Unexpected error:"+e.getMessage());
        }

    }

}
