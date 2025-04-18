package assignments.Interfaces.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       Sortable sorted;
        System.out.println("1.Bubble sort");
        System.out.println("2.Quick sort");
        System.out.println("3.Merge sort");
        int option=sc.nextInt();
        switch (option) {
            case 1: {
                sorted = new Bubblesort();
                break;
            }
            case 2: {
                sorted = new Quicksort();
                break;
            }
            case 3: {
                sorted = new Mergesort();
                break;
            }
            default: {
                System.out.println("Invalid options");
                return;
            }
        }
        sorted.sort(arr);
        if(option!=3)
        {
            for(int i:arr)
            {
                System.out.print(i+" ");
            }

        }

    }
}
