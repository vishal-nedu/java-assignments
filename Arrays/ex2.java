package assignments.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r= sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] ans=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                ans[i][j]=arr[j][i];
            }
        }
        for(int[] ar:ans)
        {
            System.out.println(Arrays.toString(ar));
        }
    }
}
