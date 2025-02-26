package assignments.unconandcond.uncon;

public class ex2 {
    public static void main(String[] args) {
        for(int i=1;i<=30;i++)
        {
            if(isprime(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean isprime(int i)
    {
        if(i<=1)
        {
            return false;
        }
        int c=2;
        while(c*c<=i)
        {
            if(i%c==0)
            {
                return false;
            }
            c+=1;
        }
        return true;
    }
}
