package assignments.Abstractclassesandmethods.ex1;

public class HourlyEmployee extends Employee{

    int hourlyworked;
    int hourpay;
    HourlyEmployee(int id,String name,int hourlyworked,int hourpay)
    {
        super(id,name);
        this.hourlyworked=hourlyworked;
        this.hourpay=hourpay;
    }

    @Override
    int calculatePay() {
        return hourpay*hourlyworked;
    }
}
