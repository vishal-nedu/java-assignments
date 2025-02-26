package assignments.datatypes;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b= sc.nextInt();
        a=a^b;
        b=a^b;
        a=b^a;
        System.out.println(a);
        System.out.println(b);
    }
}
