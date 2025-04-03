package assignments.MethodOverriding.ex1;

public class Employee {
    private int emp_id;
    private String emp_name;

    public Employee(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
    public String getEmployeedetails()
    {
        return "Employee id: "+emp_id+" ,Name: "+emp_name;
    }

}
