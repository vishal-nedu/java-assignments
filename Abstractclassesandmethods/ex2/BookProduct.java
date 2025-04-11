package assignments.Abstractclassesandmethods.ex2;

public class BookProduct  extends Product{
    String author;
    int price;

    public BookProduct(String name, String author, int price) {
        super(name);
        this.author = author;
        this.price = price;
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    String getDescription() {
        return "Books: " +name+" by author: "+author;
    }
}
