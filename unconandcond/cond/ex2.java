package assignments.unconandcond.cond;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if(score>=90&&score<=100)
        {
            System.out.println("Grade:A");
        }
        else if (score>=80&&score<89)
        {
            System.out.println("Grade:B");
        }
        else if (score>=70&&score<80)
        {
            System.out.println("Grade:C");
        }
        else if (score>=60&&score<70)
        {
            System.out.println("Grade:D");
        }
        else if (score>=50&&score<60)
        {
            System.out.println("Grade:E");
        }
        else if (score<50&&score>=0)
        {
            System.out.println("Grade:F");
        }
        else {
            System.out.println("Invalid score");
        }
    }
}

