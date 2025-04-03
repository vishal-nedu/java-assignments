package assignments.MethodOverriding.ex2;

public class Main {
    public static void main(String[] args) {
        Vehicle bike=new Bike();
        Vehicle car=new Car();
        Vehicle truck=new Truck();
        bike.start();
        bike.stop();
        car.start();
        car.stop();
        truck.start();
        truck.stop();
    }
}
