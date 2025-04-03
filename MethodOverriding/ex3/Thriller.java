package assignments.MethodOverriding.ex3;

public class Thriller extends Movie{
    public Thriller(String title, String director) {
        super(title, director);
    }

    @Override
    void genre() {
        System.out.println(title+" is a Thriller movie directed by "+director);
    }
}
