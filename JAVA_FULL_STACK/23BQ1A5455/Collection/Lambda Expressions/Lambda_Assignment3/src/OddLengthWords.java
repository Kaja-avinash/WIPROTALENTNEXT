import java.util.ArrayList;

public class OddLengthWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        words.add("Java");
        words.add("Python");
        words.add("Oracle");
        words.add("Spring");
        words.add("HTML");
        words.add("CSS");
        words.add("Node");
        words.add("React");
        words.add("Angular");
        words.add("SQL");

        words.forEach(word -> {

            if (word.length() % 2 != 0) {

                System.out.println(word);

            }

        });

    }

}