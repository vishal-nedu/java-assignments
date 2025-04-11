package assignments.Abstractclassesandmethods.ex3;

public class Action extends Movies{

    public Action(String title, String director,String review) {
        super(title, director,review);
    }

    @Override
    void genre() {
        System.out.println(title+" movie is a action movie directed by "+director);
    }

}
