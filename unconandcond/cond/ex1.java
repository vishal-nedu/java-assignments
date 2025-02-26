package assignments.unconandcond.cond;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(Math.max(a,b),c);
        System.out.println(max);
    }
}
