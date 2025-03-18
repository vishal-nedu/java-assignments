package assignments.classesandobjects;

public class Main
{
    public static void main(String[] args)
    {
        Player p1=new Player("Rudra","Attacker",8);
        Player p2=new Player("Alice","Defender",9);
        Team t1=new Team("warriors","pondy","under15");
        t1.addplayers(p1);
        t1.addplayers(p2);
        t1.playgame();
        Player p3=new Player("Bob","Goal-Keeper",4);
        Player p4=new Player("Anish","Attacker",10);
        Team t2=new Team("Fire","chennai","under15");
        t2.addplayers(p3);
        t2.addplayers(p4);
        t2.playgame();


    }
}
