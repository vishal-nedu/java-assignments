package assignments.datatypes;

import java.util.Scanner;

public class ex5 {
    enum week
    {
       Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday ;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(week.values()[n-1]);

    }
}
