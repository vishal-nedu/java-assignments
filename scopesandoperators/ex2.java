package assignments.scopesandoperators;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coefficient a:");
        double a=sc.nextDouble();
        System.out.println("Enter coefficient b:");
        double b=sc.nextDouble();
        System.out.println("Enter coefficient c:");
        double c= sc.nextDouble();;
        double dis=b*b-(4*a)*c;
        System.out.println(dis);
        if(dis>0)
        {
            double root1=(-b+Math.sqrt(dis))/(2*a);
            double root2=(-b-Math.sqrt(dis))/(2*a);
            System.out.println("Roots are real and distinct"+root1+" ,"+root2);
        }
        else if(dis==0)
        {
            double root=-b/(2*a);
            System.out.println("Roots are real and equal:"+root);
        }
        else {
            double realp=-b/(2*a);
            double imag=Math.sqrt(-dis)/(2*a);
            System.out.println("Roots are complex:"+realp+" ±"+imag+"i");
        }
    }
}
