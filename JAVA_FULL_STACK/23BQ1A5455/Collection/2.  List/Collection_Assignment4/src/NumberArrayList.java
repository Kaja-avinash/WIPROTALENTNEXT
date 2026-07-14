import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<Number>();

        numbers.add(10);
        numbers.add(15.5);
        numbers.add(22.45f);
        numbers.add(100L);

        System.out.println(numbers);

    }

}