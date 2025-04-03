package assignments.MethodOverriding.ex1;

public class HourlyEmployee extends Employee{

    int hourlyRate;
    int hoursworked;
    public HourlyEmployee(int emp_id, String emp_name,int hourlyrate,int hoursworked) {
        super(emp_id, emp_name);
        this.hourlyRate=hourlyrate;
        this.hoursworked=hoursworked;
    }

    @Override
    public String getEmployeedetails() {
        return super.getEmployeedetails()+" ,HourlyRate:"+hourlyRate+", hoursWorked:"+hoursworked;
    }
}
