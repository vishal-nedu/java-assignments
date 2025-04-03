package assignments.MethodOverriding.ex2;

public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Car is starting with ignition");
    }

    @Override
    public void stop() {
        System.out.println("car is stopped by applying brakes");

    }
}
