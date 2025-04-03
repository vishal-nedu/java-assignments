package assignments.MethodOverriding.ex2;

public class Truck extends Vehicle{
    @Override
    public void start() {
        System.out.println("Truck is starting with a heavy engine");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping using air brakes");
    }
}
