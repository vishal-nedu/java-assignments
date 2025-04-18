package assignments.Interfaces.ex1;

public class Quicksort implements Sortable{

    @Override
    public void sort(int[] arr) {
        quick(arr,0,arr.length-1);
    }
    static  void quick(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e)
        {
            while(arr[s]<pivot)
            {
                s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;

            }
        }
        quick(arr,low,e);
        quick(arr,s,high);
    }
}
