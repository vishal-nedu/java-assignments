package assignments.classesandobjects;

public class Employee {
    private int emp_id;
    private String emp_name;
    private String comp_name;
    private String emp_phone;

    public static int no_of_emp=0;

    public Employee(int emp_id, String emp_name, String comp_name, String emp_phone) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.comp_name = comp_name;
        this.emp_phone = emp_phone;
        no_of_emp+=1;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getComp_name() {
        return comp_name;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public static int getNo_of_emp() {
        return no_of_emp;
    }

    @Override
    public String toString() {
        return "EmployeesDto{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", comp_name='" + comp_name + '\'' +
                ", emp_phone='" + emp_phone + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee emp1=new Employee(1,"rudra","ABC Technologies","7898034567");
        Employee emp2=new Employee(2,"shiva","ABC Technologies","6793034251");
        Employee emp3=new Employee(3,"arul","ABC Technologies","9083478990");
       // System.out.println(emp3.toString());
        System.out.println(getNo_of_emp());


    }
}
