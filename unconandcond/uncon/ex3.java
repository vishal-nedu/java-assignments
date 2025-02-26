package assignments.unconandcond.uncon;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numberr of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                result+=arr[i];
            }
            else {
                continue;
            }

        }
    }
}
