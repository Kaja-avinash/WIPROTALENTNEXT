package race;

public class RaceDemo2 {

    public static void main(String[] args) {

        RaceThread2 hare = new RaceThread2("Hare");
        RaceThread2 tortoise = new RaceThread2("Tortoise");

        // Assign thread priorities
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}