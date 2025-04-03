package assignments.MethodOverriding.ex3;

public class Romcom extends Movie{
    public Romcom(String title, String director) {
        super(title, director);
    }

    @Override
    void genre() {
        System.out.println(title+" is a Romcom movie directd by "+director);
    }
}
