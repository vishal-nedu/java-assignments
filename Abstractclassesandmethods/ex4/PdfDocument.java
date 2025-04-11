package assignments.Abstractclassesandmethods.ex4;

public class PdfDocument extends  Document{


    public PdfDocument(String name,int size) {
        super(name,size);
    }

    @Override
    void save()
    {
        System.out.println("Saving the pdf document "+docname);

    }

    @Override
    void open()
    {
        System.out.println("opening the pdf document");

    }


}
