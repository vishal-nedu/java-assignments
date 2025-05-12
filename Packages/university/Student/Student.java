package assignments.Packages.university.Student;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private static List<Student> stud=new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void addstudent(Student student)
    {
        stud.add(student);
    }
    public static void displaystudent()
    {
        for(Student stu:stud)
        {
            System.out.println(stu);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
