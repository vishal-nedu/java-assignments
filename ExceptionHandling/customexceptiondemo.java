package assignments.ExceptionHandling;

public class customexceptiondemo
{
    public static void validateuser(int age) throws customException {
        if(age<18)
        {
            throw new customException("You are not allowed to vote");
        }
        else {
            System.out.println("You are allowed to vote");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            validateuser(19);
        }
        catch (customException e)
        {
            System.out.println("caught Exception:"+e.getMessage());
        }

    }
}
