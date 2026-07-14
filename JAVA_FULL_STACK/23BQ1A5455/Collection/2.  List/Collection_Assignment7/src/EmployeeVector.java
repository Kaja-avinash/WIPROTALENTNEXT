import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<Employee>();

        employees.add(new Employee(101, "Avinash"));
        employees.add(new Employee(102, "Rahul"));
        employees.add(new Employee(103, "Kiran"));

        System.out.println("Using Iterator");

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        System.out.println();

        System.out.println("Using Enumeration");

        Enumeration<Employee> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {

            System.out.println(enumeration.nextElement());

        }

    }

}