package assignments.Abstractclassesandmethods.ex3;

public class Romcom extends Movies{
    public Romcom(String title, String director,String review) {
        super(title, director,review);
    }

    @Override
    void genre() {
        System.out.println(title+" movie is a romcom movie directed by "+director);
    }


}
