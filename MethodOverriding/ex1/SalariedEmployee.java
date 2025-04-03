package assignments.MethodOverriding.ex1;

public class SalariedEmployee extends Employee{
    double salary;

    public SalariedEmployee(int emp_id, String emp_name,double salary) {
        super(emp_id, emp_name);
        this.salary=salary;
    }

    @Override
    public String getEmployeedetails() {
        return super.getEmployeedetails()+",salary: "+salary;
    }
}
