import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicate {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Avinash",9000));
        list.add(new Employee(102,"Rahul",15000));
        list.add(new Employee(103,"Kiran",7000));
        list.add(new Employee(104,"Ravi",22000));
        list.add(new Employee(105,"Suresh",8000));

        Predicate<Employee> p = e -> e.getSalary() < 10000;

        System.out.println("Employees with Salary Less Than 10000");

        list.stream()
                .filter(p)
                .forEach(e -> System.out.println(e.getName()));

    }

}