package assignments.Abstractclassesandmethods.ex4;

public class ImageDocument extends Document{
    public ImageDocument(String name, int size) {
        super(name, size);
    }

    @Override
    void save() {
        System.out.println("Saving the Image document "+docname);
    }

    @Override
    void open()
    {
        System.out.println("Opening the Image document");
    }
}
