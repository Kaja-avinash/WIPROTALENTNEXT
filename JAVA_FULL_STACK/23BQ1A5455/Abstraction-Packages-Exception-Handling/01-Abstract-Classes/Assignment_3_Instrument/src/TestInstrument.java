import java.util.Random;

public class TestInstrument {

    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[10];
        Random random = new Random();

        for (int i = 0; i < instruments.length; i++) {

            int choice = random.nextInt(3) + 1;

            switch (choice) {

                case 1:
                    instruments[i] = new Piano();
                    break;

                case 2:
                    instruments[i] = new Flute();
                    break;

                case 3:
                    instruments[i] = new Guitar();
                    break;
            }
        }

        System.out.println("Instrument Details\n");

        for (int i = 0; i < instruments.length; i++) {

            System.out.print("Index " + i + " : ");

            instruments[i].play();

            if (instruments[i] instanceof Piano) {
                System.out.println("Stored Object : Piano");
            } else if (instruments[i] instanceof Flute) {
                System.out.println("Stored Object : Flute");
            } else if (instruments[i] instanceof Guitar) {
                System.out.println("Stored Object : Guitar");
            }

            System.out.println();
        }
    }
}