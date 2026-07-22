package race;

public class RaceDemo1 {

    public static void main(String[] args) {

        RaceThread1 hare = new RaceThread1("Hare");
        RaceThread1 tortoise = new RaceThread1("Tortoise");

        hare.start();
        tortoise.start();
    }
}