import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<String>();

        employees.add("Avinash");
        employees.add("Rahul");
        employees.add("Kiran");
        employees.add("Suresh");

        Iterator<String> iterator = employees.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

    }

}