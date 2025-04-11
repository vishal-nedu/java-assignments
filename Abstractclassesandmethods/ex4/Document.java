package assignments.Abstractclassesandmethods.ex4;

public abstract class Document
{
    String docname;
    int size;

    public Document(String name,int size) {
        this.docname = name;
        this.size=size;
    }
    abstract void save();
    abstract void open();
    public void getinfo()
    {
        System.out.println("Document name:"+docname);
        System.out.println("size of the document:"+size+" KB");

    }
}
