import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class EmployeeSerialization {

    public static void main(String[] args) {

        try {

            Employee emp = new Employee(
                    "Avinash",
                    new Date(),
                    "AI & DS",
                    "Software Developer",
                    65000);

            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully.");

            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee employee = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println();
            System.out.println("Employee Details After Deserialization");

            System.out.println("Name        : " + employee.getName());
            System.out.println("Date of Birth : " + employee.getDateOfBirth());
            System.out.println("Department  : " + employee.getDepartment());
            System.out.println("Designation : " + employee.getDesignation());
            System.out.println("Salary      : " + employee.getSalary());

        }

        catch (Exception e) {

            e.printStackTrace();

        }

    }

}