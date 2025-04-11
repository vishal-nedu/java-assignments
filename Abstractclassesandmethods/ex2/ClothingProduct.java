package assignments.Abstractclassesandmethods.ex2;

public class ClothingProduct extends Product{

    String size;
    int price;

    public ClothingProduct(String name, String size, int price) {
        super(name);
        this.size = size;
        this.price = price;
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    String getDescription() {
        return "clothing: " +name+" size: "+size;
    }
}
