package assignments.Arrays;

import java.util.Arrays;

public class ex6BirdWatcher
{
    private int[] birdsperday;

    public ex6BirdWatcher(int[] birdsperday) {
        this.birdsperday = birdsperday;
    }

    public int[] lastweek()
    {
        return new int[]{4,5,2,0,8,4};
    }
    public int gettoday()
    {
        return birdsperday[birdsperday.length-1];
    }
    public void incrementodaycount()
    {
        birdsperday[birdsperday.length-1]+=1;
    }
    public boolean haswithoutbirds()
    {
        for(int a:birdsperday)
        {
            if(a==0)
            {
                return true;
            }
        }
        return false;
    }
    public int getcountfordays(int n)
    {
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=birdsperday[i];
        }
        return ans;
    }
    public int busdays()
    {
        int count=0;
        for(int a:birdsperday)
        {
            if(a>=5)
            {
                count+=1;
            }
        }
        return count;
    }
    public void display()
    {
        System.out.println(Arrays.toString(birdsperday));
    }

    public static void main(String[] args) {
        int[] bp={2,5,0,7,4,1};
        ex6BirdWatcher ex=new ex6BirdWatcher(bp);
        System.out.println(Arrays.toString(ex.lastweek()));
        System.out.println(ex.busdays());
        ex.incrementodaycount();
        ex.display();
        System.out.println(ex.haswithoutbirds());
        System.out.println(ex.getcountfordays(4));
    }

}
