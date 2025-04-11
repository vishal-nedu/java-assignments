package assignments.Abstractclassesandmethods.ex4;

public class Main {
    public static void main(String[] args) {
        Document doc1=new TextDocument("Java assignment",10);
        Document doc2=new PdfDocument("Script",124);
        Document doc3=new ImageDocument("Img001",101);
        doc1.open();
        doc1.getinfo();
        doc1.save();
        doc3.open();
        doc3.getinfo();
        doc3.save();
    }
}
