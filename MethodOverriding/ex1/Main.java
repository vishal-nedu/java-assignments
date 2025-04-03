package assignments.MethodOverriding.ex1;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new HourlyEmployee(101,"Rudra",20,40);
        Employee emp2=new SalariedEmployee(102,"Butcher",40000);
        System.out.println(emp1.getEmployeedetails());
        System.out.println(emp2.getEmployeedetails());
    }
}
