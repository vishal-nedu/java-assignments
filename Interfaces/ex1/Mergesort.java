package assignments.Interfaces.ex1;

import java.util.Arrays;

public class Mergesort implements Sortable{

    @Override
    public void sort(int[] arr) {
           int[] sorted= merge(arr);
        System.out.println(Arrays.toString(sorted));

    }
    static int[] merge(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;
        int[] left=merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge(Arrays.copyOfRange(arr,mid,arr.length));
        return mer(left,right);
    }
    static int[] mer(int[] left,int[] right)
    {
        int[] mix=new int[left.length+ right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&&j<right.length)
        {
            if(left[i]<right[j])
            {
                mix[k]=left[i];
                i++;
            }
            else {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length)
        {
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;
    }

}
