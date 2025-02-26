package assignments.scopesandoperators;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        boolean t=true;
        while(t)
        {
            System.out.println("Bitwise operations");
            System.out.println("1.AND");
            System.out.println("2.OR");
            System.out.println("3.NOT");
            System.out.println("4.XOR");
            System.out.println("5.RIGHT SHIFT");
            System.out.println("6.LEFT SHIFT");
            System.out.println("7.UNSIGNED RIGHT SHIFT");
            System.out.println("Enter the option: ");
            int n=sc.nextInt();
            switch (n)
            {
                case 1:
                {
                    System.out.println("enter the value of a");
                    a=sc.nextInt();
                    System.out.println("Enter the value of b");
                    b=sc.nextInt();
                    System.out.println(a&b);
                    break;
                }
                case 2:
                {
                    System.out.println("enter the value of a");
                    a=sc.nextInt();
                    System.out.println("Enter the value of b");
                    b=sc.nextInt();
                    System.out.println(a|b);
                    break;
                }
                case 3:
                {
                    System.out.println("enter the value of a");
                    a=sc.nextInt();
                    System.out.println(~a);
                    break;
                }
                case 4:
                {
                    System.out.println("enter the value of a");
                    a=sc.nextInt();
                    System.out.println("Enter the value of b");
                    b=sc.nextInt();
                    System.out.println(a^b);
                    break;
                }
                case 5:
                {
                    System.out.println("enter the value of a");
                    a=sc.nextInt();
                    System.out.println("Enter the value of b");
                    b=sc.nextInt();
                    System.out.println(a>>b);
                    break;
                }
                case 6:
                {
                    System.out.println("enter the value of a");
                    a=sc.nextInt();
                    System.out.println("Enter the value of b");
                    b=sc.nextInt();
                    System.out.println(a<<b);
                    break;
                }
                case 7:
                {
                    System.out.println("enter the value of a");
                    a=sc.nextInt();
                    System.out.println("Enter the value of b");
                    b=sc.nextInt();
                    System.out.println(a>>>b);
                    break;
                }
            }
            System.out.println("Do you want to contiue:y/n");
            char ch=sc.next().charAt(0);
            if(ch=='y')
            {
                t=true;
            }
            else {
                t=false;
            }

        }
    }
}
