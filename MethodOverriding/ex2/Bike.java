package assignments.MethodOverriding.ex2;

public class Bike extends Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is started with kickstart");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped by handbrakes");

    }
}
