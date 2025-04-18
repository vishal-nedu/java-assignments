package assignments.Interfaces.ex2;

public class StreamingPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Streaming Player is playing");
    }

    @Override
    public void pause() {
        System.out.println("Streaming Player is paused");
    }

    @Override
    public void stop() {
        System.out.println("Streaming Player is stopped");

    }
}
