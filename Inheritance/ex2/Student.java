package assignments.Inheritance.ex2;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this(name,18);
    }
    public void display()
    {
        System.out.println("Name:"+name+",Age:"+age);
    }
}
