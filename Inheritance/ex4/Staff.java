package assignments.Inheritance.ex4;

public class Staff extends User{
    String dept;
    public Staff(String name, String id,String dept) {
        super(name, id);
        this.dept=dept;
    }
}
