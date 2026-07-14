import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Avinash","Pune",50000));
        list.add(new Employee(102,"Rahul","Hyderabad",60000));
        list.add(new Employee(103,"Kiran","Bangalore",70000));
        list.add(new Employee(104,"Ravi","Chennai",55000));
        list.add(new Employee(105,"Suresh","Delhi",65000));

        Function<Employee,String> f = e -> e.location;

        ArrayList<String> locations = new ArrayList<>();

        list.forEach(e -> locations.add(f.apply(e)));

        System.out.println(locations);

    }
}