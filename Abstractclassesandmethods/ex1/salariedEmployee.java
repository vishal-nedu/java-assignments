package assignments.Abstractclassesandmethods.ex1;

public class salariedEmployee extends Employee{

    int monthsalary;
    public salariedEmployee(int emp_id, String emp_name,int salary) {
        super(emp_id, emp_name);
        this.monthsalary=salary;
    }

    @Override
    int calculatePay() {
        return monthsalary;
    }
}
