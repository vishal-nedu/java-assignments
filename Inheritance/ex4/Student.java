package assignments.Inheritance.ex4;

public class Student extends User {
    String std;
    public Student(String name, String id, String std) {
        super(name, id);
        this.std = std;
    }
}
