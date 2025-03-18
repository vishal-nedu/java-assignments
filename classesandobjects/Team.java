package assignments.classesandobjects;

import java.util.ArrayList;
import java.util.List;

public class Team {
   private  String name;
   private String city;
    private String division;
    List<Player> players=new ArrayList<>();

    public Team(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
    }
    public void addplayers(Player player)
    {
        this.players.add(player);
    }
    public void playgame()
    {
        System.out.println(name+" team is playing game with the following players");
        for(Player p:players)
        {
            System.out.println(p.toString());
        }
    }
    public void hirecoach()
    {
        System.out.println("this team need to hire a coach");
    }

}
