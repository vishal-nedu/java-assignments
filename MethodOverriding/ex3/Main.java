package assignments.MethodOverriding.ex3;

public class Main {
    public static void main(String[] args) {
        Movie movie1=new Thriller("Por thozil","vignesh raja");
        Movie movie2=new Romcom("Ok Kanmani","Manirathnam");
        movie1.genre();
        movie2.genre();
    }
}
