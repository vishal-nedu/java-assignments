package assignments.Packages.university.Faculty;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private int facultyid;
    private  static List<Faculty> fac=new ArrayList<>();

    public Faculty(String name, int facultyid) {
        this.name = name;
        this.facultyid = facultyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFacultyid() {
        return facultyid;
    }

    public void setFacultyid(int facultyid) {
        this.facultyid = facultyid;
    }
   public static void addfaculty(Faculty facl)
   {
       fac.add(facl);
   }
   public static void displayfac()
   {
       for(Faculty facc:fac)
       {
           System.out.println(facc);
       }
   }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", facultyid=" + facultyid +
                '}';
    }
}
