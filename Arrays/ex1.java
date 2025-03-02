package assignments.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the elements");
        for(int i=0;i<l;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the count of rotation:");
        int r=sc.nextInt();
        int k=arr.length-r;
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(k==arr.length)
            {
                k=0;
                ans[i]=arr[k];
            }
            else {
                ans[i]=arr[k];
            }
            k+=1;
        }
        System.out.println(Arrays.toString(ans));

    }
}
