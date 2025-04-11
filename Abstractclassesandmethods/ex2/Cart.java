package assignments.Abstractclassesandmethods.ex2;

import java.util.ArrayList;

public class Cart {
    public static void main(String[] args) {
        ArrayList<Product> list=new ArrayList<>();
        list.add(new ElectronicsProduct("Laptop","Dell",80000));
        list.add(new ClothingProduct("shirt","L",900));
        list.add(new BookProduct("perfect life","vishal",1000));
        int total=0;
        for (Product prod:list)
        {
            System.out.println(prod.getDescription()+" "+" price of: "+prod.getPrice());
            total+= prod.getPrice();
        }
        System.out.println("The total cost will be: "+total);
    }
}
