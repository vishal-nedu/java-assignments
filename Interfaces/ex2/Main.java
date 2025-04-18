package assignments.Interfaces.ex2;

public class Main {
    public static void main(String[] args) {
        CDPlayer player1=new CDPlayer();
        player1.play();
        player1.pause();
        player1.play();
        player1.stop();
        MP3Player player2 =new MP3Player();
        player2.play();
        player2.pause();
        player2.play();
        player2.stop();
        StreamingPlayer player3 =new StreamingPlayer();
        player3.play();
        player3.pause();
        player3.play();
        player3.stop();
    }
}
