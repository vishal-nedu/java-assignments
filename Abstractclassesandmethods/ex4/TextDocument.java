package assignments.Abstractclassesandmethods.ex4;

public class TextDocument extends Document {
    public TextDocument(String name, int size) {
        super(name, size);
    }

    @Override
    void save()
    {
        System.out.println("saving the text document "+docname);
    }

    @Override
    void open()
    {
        System.out.println("Opening the text document");

    }
}
