package assignments.Strings;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.next();
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u')
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
