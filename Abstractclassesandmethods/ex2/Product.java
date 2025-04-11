package assignments.Abstractclassesandmethods.ex2;

public abstract class Product {
    String name;

    public Product(String name) {
        this.name = name;
    }
    abstract int getPrice();
    abstract String getDescription();
}
