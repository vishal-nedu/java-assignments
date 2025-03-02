package assignments.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for the first matrix");
        int r1= sc.nextInt();
        System.out.println("Enter the number of columns in the first matrix");
        int c1=sc.nextInt();
        int[][] arr=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows for the second matrix");
        int r2= sc.nextInt();
        System.out.println("Enter the number of columns in the second matrix");
        int c2=sc.nextInt();
        int[][] arr1=new int[r2][c2];
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        if(r1!=c2)
        {
            System.out.println("can't able to multiply");
            return;
        }
        int[][] ans=new int[r1][c2];
        for (int i = 0; i <r1 ; i++)
        {
            for(int j=0;j<c2;j++)
            {
                int prod=1;
                int sum=0;
                for(int k=0;k<r2;k++)
                {
                    prod=arr[i][k]*arr1[k][j];
                    sum+=prod;
                }
                ans[i][j]=sum;
            }
        }
        for(int[] ar:ans)
        {
            System.out.println(Arrays.toString(ar));
        }

    }
}
