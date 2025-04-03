package assignments.MethodOverriding.ex3;

public abstract class Movie {
    String title;
    String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }
    abstract void genre();
}
