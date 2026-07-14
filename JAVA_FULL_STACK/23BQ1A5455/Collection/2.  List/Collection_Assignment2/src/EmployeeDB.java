import java.util.ArrayList;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<Employee>();

    public boolean addEmployee(Employee e) {

        return list.add(e);

    }

    public boolean deleteEmployee(int empId) {

        for (Employee e : list) {

            if (e.empId == empId) {

                list.remove(e);

                return true;

            }

        }

        return false;

    }

    public String showPaySlip(int empId) {

        for (Employee e : list) {

            if (e.empId == empId) {

                return "Pay Slip for " + e.empName +
                        "\nSalary : " + e.salary;

            }

        }

        return "Employee Not Found";

    }

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101, "Avinash",
                "avinash@gmail.com", "Male", 60000));

        db.addEmployee(new Employee(102, "Rahul",
                "rahul@gmail.com", "Male", 55000));

        System.out.println("Employee Details");

        for (Employee e : db.list) {

            e.GetEmployeeDetails();

            System.out.println();

        }

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println();

        System.out.println("After Deletion");

        for (Employee e : db.list) {

            e.GetEmployeeDetails();

        }

    }

}