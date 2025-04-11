package assignments.Abstractclassesandmethods.ex2;

public class ElectronicsProduct extends Product{

    String brand;
    int price;

    public ElectronicsProduct(String name, String brand, int price) {
        super(name);
        this.brand = brand;
        this.price = price;
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    String getDescription() {
        return "Electronics:"+name+" "+brand;
    }
}
