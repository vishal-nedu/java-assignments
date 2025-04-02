package assignments.MethodOverloading.ex1;

public class MathOperations {
    public int add(int a,int b)
    {
        return a+b;
    }
    public float add(float a,float b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public float sub(float a,float b)
    {
        return a-b;
    }
    public double sub(double a,double b)
    {
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public float mul(float a,float b)
    {
        return a*b;
    }
    public double mul(double a,double b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Division is not allowed by zero");
        }
        return a/b;
    }
    public float div(float a,float b)
    {
        if(b==0.0f)
        {
            throw new ArithmeticException("Division is not allowed by zero");
        }
        return a/b;
    }
    public double div(double a,double b)
    {
        if(b==0.0)
        {
            throw new ArithmeticException("Division is not allowed by zero");
        }
        return a/b;
    }

}
