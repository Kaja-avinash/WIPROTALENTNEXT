import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts =
                new HashMap<String, Integer>();

        contacts.put("Avinash", 123456789);
        contacts.put("Rahul", 987654321);
        contacts.put("Kiran", 456789123);

        System.out.println(contacts.containsKey("Avinash"));

        System.out.println(contacts.containsValue(987654321));

        Iterator<Map.Entry<String, Integer>> iterator =
                contacts.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> entry = iterator.next();

            System.out.println(entry.getKey() +
                    " -> " +
                    entry.getValue());

        }

    }

}