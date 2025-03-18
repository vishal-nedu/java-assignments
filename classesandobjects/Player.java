package assignments.classesandobjects;

public class Player {
    private String name;
    private String position;
    private int jerseyNumber;

    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", jersyNumber=" + jerseyNumber +
                '}';
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    public void playGame()
    {
        System.out.println(name+"is playing in the game as"+position);
    }
    public void train()
    {
        System.out.println(name+"is need to be trained properly");
    }
}
