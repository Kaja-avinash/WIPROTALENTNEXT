import java.io.*;
import java.util.*;

public class EmployeeManagementSystem {

    static final String FILE_NAME = "employee.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Employee Salary: ");
                double salary = sc.nextDouble();

                Employee emp = new Employee(id, name, age, salary);

                addEmployee(emp);

                break;

            case 2:

                displayEmployees();

                break;

            case 3:

                System.out.println("Exiting the System");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice");
            }
        }
    }

    static void addEmployee(Employee emp) {

        try {

            ArrayList<Employee> list = readEmployees();

            list.add(emp);

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            oos.writeObject(list);

            oos.close();

            System.out.println("Employee Added Successfully.");

        }

        catch (Exception e) {

            e.printStackTrace();

        }

    }

    static ArrayList<Employee> readEmployees() {

        ArrayList<Employee> list = new ArrayList<>();

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            list = (ArrayList<Employee>) ois.readObject();

            ois.close();

        }

        catch (Exception e) {

        }

        return list;

    }

    static void displayEmployees() {

        ArrayList<Employee> list = readEmployees();

        System.out.println("\n-----Report-----");

        for (Employee e : list) {

            System.out.println(
                    e.getId() + " " +
                    e.getName() + " " +
                    e.getAge() + " " +
                    e.getSalary());

        }

        System.out.println("-----End of Report-----");

    }

}