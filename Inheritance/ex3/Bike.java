package assignments.Inheritance.ex3;

public class Bike extends Vehicle{
    boolean gear;
    public Bike(String brand, int speed,boolean gear) {
        super(brand, speed);
        this.gear=gear;
    }

    @Override
    void fueltype() {
        System.out.println("bike uses petrol or super petrol");
    }

    void isgear()
    {
        if(gear)
        {
            System.out.println("It is a gear bike");
        }
        else {
            System.out.println("It is a gearless bike");
        }
    }

    @Override
    void no_0f_wheels() {
        System.out.println(brand+"bike contains two wheels ");
    }
    @Override
    void display() {
        System.out.println("Brand name:"+brand+","+"speed:"+speed);

    }
}
