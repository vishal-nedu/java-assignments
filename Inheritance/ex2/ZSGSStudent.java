package assignments.Inheritance.ex2;

public class ZSGSStudent extends Student {
    String course;
    ZSGSStudent(String name,int age,String course)
    {
        super(name,age);
        this.course=course;
    }

    public ZSGSStudent(String name, String course) {
        super(name);
        this.course = course;
    }
    public void display()
    {
        super.display();
        System.out.println("course:" +course);
    }
}
