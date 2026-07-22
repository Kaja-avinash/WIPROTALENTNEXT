package race;

public class RaceThread3 extends Thread {

    private static boolean raceFinished = false;

    public RaceThread3(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int meter = 1; meter <= 100 && !raceFinished; meter++) {

            System.out.println(getName() + " : " + meter + " meters");

            // Hare sleeps after running 60 meters
            if (getName().equals("Hare") && meter == 60) {

                System.out.println("\nHare is sleeping for 1000 milliseconds...\n");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (meter == 100 && !raceFinished) {
                raceFinished = true;
                System.out.println("\n" + getName() + " WINS THE RACE!");
            }
        }
    }
}