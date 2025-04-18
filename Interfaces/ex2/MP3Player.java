package assignments.Interfaces.ex2;

public class MP3Player implements Playable{
    @Override
    public void play() {
        System.out.println("MP3 player is started to play");
    }

    @Override
    public void pause() {
        System.out.println("MP3 player is paused");
    }

    @Override
    public void stop() {
        System.out.println("MP3 player is stopped");

    }
}
