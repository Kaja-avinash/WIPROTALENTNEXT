import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<String>();

        set.add("India");
        set.add("Japan");
        set.add("USA");
        set.add("Australia");
        set.add("Germany");

        System.out.println("Original TreeSet");

        System.out.println(set);

        System.out.println();

        System.out.println("Reverse Order");

        System.out.println(set.descendingSet());

        System.out.println();

        System.out.println("Using Iterator");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        System.out.println();

        if (set.contains("India")) {

            System.out.println("India Exists");

        } else {

            System.out.println("India Not Found");

        }

    }

}