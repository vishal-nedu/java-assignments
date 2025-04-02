package assignments.MethodOverloading.ex1;

public class Main {
    public static void main(String[] args) {
        MathOperations math=new MathOperations();
        System.out.println(math.add(1,3));
        System.out.println(math.add(10.0,5));
        System.out.println(math.add(10.5f,20.3f));
        System.out.println(math.sub(10,5));
    }
}
