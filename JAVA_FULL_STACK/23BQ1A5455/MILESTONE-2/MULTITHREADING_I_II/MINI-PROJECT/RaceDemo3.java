package race;

public class RaceDemo3 {

    public static void main(String[] args) {

        RaceThread3 hare = new RaceThread3("Hare");
        RaceThread3 tortoise = new RaceThread3("Tortoise");

        // Set priorities
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}