package assignments.Inheritance.ex4;

public class Librarian {
    private String name;
    private String id;
    private String password;
    private String Searchstring;

    public void verify()
    {
        System.out.println("verifying the librarian");
    }
    void search(LibraryDatabase data,String title)
    {
        data.search(title);
    }

}
