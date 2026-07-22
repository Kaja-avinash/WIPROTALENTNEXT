package race;

public class RaceThread2 extends Thread {

    private static boolean raceFinished = false;

    public RaceThread2(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int meter = 1; meter <= 100 && !raceFinished; meter++) {

            System.out.println(getName() + " : " + meter + " meters");

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