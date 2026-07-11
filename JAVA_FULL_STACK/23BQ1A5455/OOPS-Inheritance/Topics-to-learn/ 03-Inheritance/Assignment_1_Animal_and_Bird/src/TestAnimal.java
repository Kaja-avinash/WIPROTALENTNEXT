public class TestAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println("Animal Object:");
        animal.eat();
        animal.sleep();

        System.out.println();

        Bird bird = new Bird();

        System.out.println("Bird Object:");
        bird.eat();
        bird.sleep();
        bird.fly();

    }

}