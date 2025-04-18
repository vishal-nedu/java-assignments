package assignments.Interfaces.ex2;

public class CDPlayer  implements Playable{

    @Override
    public void play() {
        System.out.println("CD Player is playing");
    }

    @Override
    public void pause() {
        System.out.println("CD Player is paused");
    }

    @Override
    public void stop() {
        System.out.println("CD Player is stopped");

    }
}
