package assignments.Abstractclassesandmethods.ex3;

public abstract class Movies
{
    String name;
    String title;
    String director;
    String review;

    public Movies(String title, String director,String review) {
        this.title = title;
        this.director = director;
        this.review=review;
    }
    abstract void genre();
    void review()
    {
        System.out.println("It is a "+review+" movie");
    }
}
