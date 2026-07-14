import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");

        System.out.println(map.containsKey("India"));

        System.out.println(map.containsValue("Tokyo"));

        Iterator<Map.Entry<String, String>> iterator =
                map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, String> entry = iterator.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }

}