import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("radar");
        words.add("hello");
        words.add("wow");
        words.add("spring");
        words.add("noon");
        words.add("python");
        words.add("civic");

        Predicate<String> p = str ->

                str.equals(new StringBuilder(str).reverse().toString());

        words.stream()

                .filter(p)

                .forEach(System.out::println);

    }

}