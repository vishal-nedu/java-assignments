package assignments.Inheritance.ex1;

public class Circle extends Shapes{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }
}
