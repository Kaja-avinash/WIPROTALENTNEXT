import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("Spring");
        words.add("Oracle");
        words.add("React");
        words.add("Node");
        words.add("HTML");
        words.add("CSS");
        words.add("SQL");
        words.add("Docker");

        Consumer<String> consumer = word ->

                System.out.println(new StringBuilder(word).reverse());

        System.out.println("Reversed Words");

        words.forEach(consumer);

    }

}