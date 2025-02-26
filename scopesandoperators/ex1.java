package assignments.scopesandoperators;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the celsius");
        double c= sc.nextDouble();
        double f=(c*9/5)+32;
        System.out.println(f);
    }
}
