package assignments.Packages.university.Main;

import assignments.Packages.university.Faculty.Faculty;
import assignments.Packages.university.Student.Student;
import assignments.Packages.university.courses.courses;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 =new Student(1,"Rudra");
        Student student2=new Student(2,"Mithran");
        Student student3=new Student(3,"Ravi");
        Student.addstudent(student1);
        Student.addstudent(student2);
        Student.addstudent(student3);
        Student.displaystudent();
        courses course1=new courses("AI",4);
        courses.addcourses(course1);
        courses.displaycourse();
        Faculty faculty1=new Faculty("Walter white",1);
        Faculty.addfaculty(faculty1);
        Faculty.displayfac();

    }
}
