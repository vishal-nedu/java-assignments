package assignments.Inheritance.ex3;

public abstract class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void fueltype();
   // abstract void no_of_gears();
    abstract void no_0f_wheels();
    abstract void display();




}
