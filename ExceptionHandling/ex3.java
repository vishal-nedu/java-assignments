package assignments.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex3  {
    public static void main(String[] args){
        System.out.println("Enter the phone number");
        Scanner sc=new Scanner(System.in);
        String number=sc.next();
        for(int i=0;i<number.length();i++)
        {
            if(!Character.isDigit(number.charAt(i)))
            {
                throw new InputMismatchException();
            }
        }
        System.out.println("Number given successfully");

    }

}
