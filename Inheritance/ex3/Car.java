package assignments.Inheritance.ex3;

public class Car extends Vehicle{
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fueltype() {
        System.out.println("car can be run in diesel or petrol");
    }

    @Override
    void no_0f_wheels()
    {
        System.out.println("car has 4 wheels");
    }

    @Override
    void display() {
        System.out.println("Brand name:"+brand+","+"speed:"+speed);

    }
}
