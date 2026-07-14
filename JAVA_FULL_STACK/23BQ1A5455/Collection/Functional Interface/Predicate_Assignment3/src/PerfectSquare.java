import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquare {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }

        Predicate<Integer> p = n -> {

            int root = (int) Math.sqrt(n);

            return root * root == n;

        };

        System.out.println("Perfect Square Numbers");

        list.stream()
                .filter(p)
                .forEach(System.out::println);

    }

}