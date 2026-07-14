import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsLambda {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        words.add("Java");
        words.add("Python");
        words.add("Oracle");
        words.add("Spring");
        words.add("Hibernate");
        words.add("React");
        words.add("Angular");
        words.add("Node");
        words.add("HTML");
        words.add("CSS");

        Collections.reverse(words);

        words.forEach(word -> System.out.println(word));

    }

}