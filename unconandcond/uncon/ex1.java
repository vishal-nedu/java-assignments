package assignments.unconandcond.uncon;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to check:");
        int num=sc.nextInt();
        int count=0;
        int ind=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==num)
            {
                count+=1;
            }
            if(count==2)
            {
                ind=i;
                break;
            }
        }
        System.out.println(ind);
    }
}
