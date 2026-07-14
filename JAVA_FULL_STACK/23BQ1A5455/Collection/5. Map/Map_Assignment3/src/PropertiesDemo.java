import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");
        p.put("Tamil Nadu", "Chennai");

        Iterator<Map.Entry<Object, Object>> iterator =
                p.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Object, Object> entry = iterator.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }

}