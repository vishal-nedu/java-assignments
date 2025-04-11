package assignments.Abstractclassesandmethods.ex1;

public class Main {
    public static void main(String[] args) {
        Employee emp=new HourlyEmployee(1,"Rudra",10,20);
        System.out.println(emp.getEmployeedetails());
        System.out.println(emp.calculatePay());
        Employee emp2=new salariedEmployee(2,"akil",30000);
        System.out.println(emp2.getEmployeedetails());
        System.out.println(emp2.calculatePay());

    }
}
