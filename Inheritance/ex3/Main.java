package assignments.Inheritance.ex3;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car("Maruti",200);
        car1.display();
        car1.fueltype();
        car1.no_0f_wheels();
        Bike bike1=new Bike("RE",200,true);
        bike1.display();
        bike1.fueltype();
        bike1.no_0f_wheels();
       // bike1.display();
        bike1.isgear();

    }
}
