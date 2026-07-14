import java.util.ArrayList;

public class PrimeLambda {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 25; i++) {

            numbers.add((int) (Math.random() * 100) + 1);

        }

        System.out.println("All Numbers");

        System.out.println(numbers);

        System.out.println();

        System.out.println("Prime Numbers");

        numbers.forEach(number -> {

            boolean prime = true;

            if (number <= 1) {

                prime = false;

            } else {

                for (int i = 2; i <= Math.sqrt(number); i++) {

                    if (number % i == 0) {

                        prime = false;
                        break;

                    }

                }

            }

            if (prime) {

                System.out.println(number);

            }

        });

    }

}