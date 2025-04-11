package assignments.Abstractclassesandmethods.ex3;

public class Main {
    public static void main(String[] args) {
        Movies movie1=new Action("The dark knight","christoper nolan","Blockbuster");
        Movies movie2=new Romcom("guruvarmadiyil","vipin das","Blockbuster");
        movie1.genre();
        movie1.review();
        movie2.genre();
        movie2.review();
    }
}
