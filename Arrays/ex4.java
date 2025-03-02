package assignments.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int num=1;
        while(num<=n*n)
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]=num++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr[i][right]=num++;
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                arr[bottom][i]=num++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                arr[i][left]=num++;
            }
            left++;
        }
        for(int[] ar:arr)
        {
            System.out.println(Arrays.toString(ar));
        }
    }
}
