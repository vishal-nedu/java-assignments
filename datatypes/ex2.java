package assignments.datatypes;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the float value:");
        float q=sc.nextFloat();
        System.out.println("Enter the double value:");
        double d= sc.nextDouble();
        System.out.println("Enter the integer value:");
        int i= sc.nextInt();
        System.out.println((int)q);
        System.out.println((float)d);
        short s= (short) i;
        System.out.println(s);


    }
}
