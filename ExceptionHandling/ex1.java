package assignments.ExceptionHandling;

import java.util.Scanner;

public class ex1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values to divide");
        System.out.println("Enter the dividend");
        int dividend=sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor=sc.nextInt();
        int ans=0;
        try
        {
            ans=dividend/divisor;
            System.out.println(ans);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Trying to divide by zero");
        }
    }
}
