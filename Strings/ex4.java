package assignments.Strings;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        boolean b=validate(email);
       if(b)
       {
           System.out.println("Valid email");
       }
       else {
           System.out.println("Invalid email");
       }
    }

    public static boolean validate(String email)
    {
        if(!email.contains("@"))
        {
            return false;
        }
        if(!email.contains("."))
        {
            return false;
        }
        if(email.indexOf("@")!=email.lastIndexOf("@"))
        {
            return false;
        }
        if(email.indexOf("@")==0||email.indexOf("@")==email.length()-1)
        {
            return false;
        }
        int doti=email.indexOf(".");
        int aindex=email.indexOf("@");
        if(doti==aindex+1)
        {
            return false;
        }
        if(doti==email.length()-1)
        {
            return false;
        }
        String domain=email.substring(doti+1);
        if(domain.length()<2)
        {
            return false;
        }
        return true;
    }
}
