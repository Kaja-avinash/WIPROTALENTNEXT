import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {

            list.add(i);

        }

        Consumer<Integer> consumer = number -> {

            if (number % 2 == 0)

                System.out.println(number + " even");

            else

                System.out.println(number + " odd");

        };

        list.forEach(consumer);

    }

}