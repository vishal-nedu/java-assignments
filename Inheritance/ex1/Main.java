package assignments.Inheritance.ex1;

public class Main {
    public static void main(String[] args) {
        Shapes circle=new Circle(3);
        Shapes rectangle=new Rectangle(3,4);
        System.out.printf("%.2f",circle.area());
        System.out.println();
        System.out.printf("%.2f",circle.perimeter());
        System.out.println();
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
