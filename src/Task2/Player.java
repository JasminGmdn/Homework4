package Task2;

import java.util.Scanner;

public class Player implements Playable, Recordable {

    @Override
    public void record() {
        System.out.println("Start recording");
    }

    @Override
    public void play() {
        System.out.println("Start playing");
    }

    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }




    public static void main(String[] args) {
        Playable instance1 = new Player();
        Recordable instance2 = new Player();

        Scanner in = new Scanner(System.in);
        System.out.println("Do you wanna play or record? ");
        String function = in.next();


        if (function.equals("Play")) {
            instance1.play();
            instance1.pause();
            instance1.stop();

        } else if (function.equals("Record")) {
            instance2.record();
            instance2.pause();
            instance2.stop();
        }
    }
}
