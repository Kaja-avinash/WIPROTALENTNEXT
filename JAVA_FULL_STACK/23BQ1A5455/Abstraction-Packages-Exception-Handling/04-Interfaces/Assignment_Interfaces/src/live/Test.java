package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        System.out.println("===== Direct Object Calls =====");

        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        System.out.println();

        System.out.println("===== Polymorphism Using Interface =====");

        Playable playable;

        playable = veena;
        playable.play();

        playable = saxophone;
        playable.play();

    }

}