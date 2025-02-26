package assignments.datatypes;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int no_of_stud=sc.nextInt();
        double total_weight=0;
        for(int i=0;i<no_of_stud;i++)
        {
            System.out.println("Enter the Weight:");
            double weight=sc.nextDouble();
            total_weight+=weight;
        }
        double average=total_weight/no_of_stud;
        System.out.println(average);

    }
}
