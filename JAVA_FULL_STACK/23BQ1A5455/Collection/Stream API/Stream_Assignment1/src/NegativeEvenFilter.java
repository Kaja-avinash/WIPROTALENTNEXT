import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenFilter {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(-10);
        numbers.add(15);
        numbers.add(-4);
        numbers.add(22);
        numbers.add(-18);
        numbers.add(7);
        numbers.add(-9);
        numbers.add(-20);

        List<Integer> result = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original ArrayList");
        System.out.println(numbers);

        System.out.println();

        System.out.println("Negative Even Numbers");
        System.out.println(result);
    }
}