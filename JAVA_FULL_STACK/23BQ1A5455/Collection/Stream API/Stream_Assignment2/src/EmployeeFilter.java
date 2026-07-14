import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Avinash", 21, "Pune"));
        employees.add(new Employee(102, "Rahul", 22, "Hyderabad"));
        employees.add(new Employee(103, "Kiran", 23, "Pune"));
        employees.add(new Employee(104, "Suresh", 24, "Bangalore"));
        employees.add(new Employee(105, "Ravi", 25, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune");

        puneEmployees.forEach(System.out::println);

    }

}