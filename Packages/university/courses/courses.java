package assignments.Packages.university.courses;

import java.util.ArrayList;
import java.util.List;

public class courses {
    private String courseName;
    private  int duration;
    private static List<courses> courselist=new ArrayList<>();

    public courses(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public static void addcourses(courses course)
    {
        courselist.add(course);
    }
    public static void displaycourse()
    {
        for(courses course:courselist)
        {
            System.out.println(course);
        }
    }

    @Override
    public String toString() {
        return "courses{" +
                "courseName='" + courseName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
