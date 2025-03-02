package assignments.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int[][] arr={{60,58,90,78},{91,56,64},{59,40}};
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        while(b)
        {
            System.out.println("1.Enter Weight");
            System.out.println("2.getminimumweight");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter the option:");
            int n= sc.nextInt();
            switch (n)
            {
                case 1:
                {
                    System.out.println("Enter the row:");
                    int r=sc.nextInt();
                    System.out.println("Enter the Weight:");
                    int w= sc.nextInt();
                    arr=enterweight(r,w,arr);
                    break;

                }
                case 2:
                {
                    System.out.println("Enter the row to find the minimum of a person");
                    int r= sc.nextInt();
                    int ans=minimumweight(r,arr);
                    System.out.println(ans);
                    break;
                }
                case 3:
                {
                    for(int[] ar:arr)
                    {
                        System.out.println(Arrays.toString(ar));
                    }
                        break;
                }
                case 4:
                {
                    b=false;
                    break;
                }
            }

        }

    }

    public static int minimumweight(int r, int[][] arr)
    {
        int l=arr[r].length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l;i++)
        {
            if(arr[r][i]<min)
            {
                min=arr[r][i];
            }
        }
        return min;
    }

    public static int[][] enterweight(int r, int w,int[][] arr)
    {
        if(r>=arr.length)
        {
            int l= arr.length+1;
            int[][] temp=new int[l][];
            for(int i=0;i<l-1;i++)
            {
                temp[i]=arr[i];
            }
            int[] ar={w};
            temp[l-1]=ar;
            arr=temp;
            return arr;
        }
        else {
            int cl=(arr[r].length)+1;
            int[] temp=new int[cl];
            for(int i=0;i<=cl-2;i++)
            {
                temp[i]=arr[r][i];
            }
            temp[cl-1]=w;
            arr[r]=temp;
        }
        return arr;
    }
}
