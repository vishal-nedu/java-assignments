package assignments.Inheritance.ex1;

public class Rectangle extends Shapes{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double area() {
        return width*height;
    }

    @Override
    double perimeter() {
        return 2*(width+height);
    }
}
