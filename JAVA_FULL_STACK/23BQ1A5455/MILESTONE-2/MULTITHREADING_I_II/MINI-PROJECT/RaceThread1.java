package race;

public class RaceThread1 extends Thread {

    // Shared variable to indicate whether the race has finished
    private static boolean raceFinished = false;

    public RaceThread1(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int meter = 1; meter <= 100 && !raceFinished; meter++) {

            System.out.println(getName() + " : " + meter + " meters");

            // Small delay so both threads can execute alternately
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Declare winner
            if (meter == 100 && !raceFinished) {
                raceFinished = true;
                System.out.println("\n" + getName() + " WINS THE RACE!");
            }
        }
    }
}