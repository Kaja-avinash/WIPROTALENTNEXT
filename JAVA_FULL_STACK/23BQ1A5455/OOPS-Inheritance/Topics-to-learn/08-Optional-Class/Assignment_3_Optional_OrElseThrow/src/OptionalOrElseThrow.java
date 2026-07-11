import java.util.Optional;

public class OptionalOrElseThrow {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee object is null"));

            System.out.println(employee.getId());
            System.out.println(employee.getName());

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }

    }

}