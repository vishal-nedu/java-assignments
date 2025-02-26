package assignments.scopesandoperators;

public class ex4 {
    public static void main(String[] args) {
        int a=15;
        if(a>10)
        {
            int b=98;
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println(a);
        System.out.println(b);
        //compiler error
        //cannot find symbol
        //symbol: variable b
    }
}
