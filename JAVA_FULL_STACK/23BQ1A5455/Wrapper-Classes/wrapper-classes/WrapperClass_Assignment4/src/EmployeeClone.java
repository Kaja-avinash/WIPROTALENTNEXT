public class EmployeeClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emp1 = new Employee(101, "Avinash", 50000);

        Employee emp2 = (Employee) emp1.clone();

        // Change the original employee
        emp1.empId = 102;
        emp1.name = "Rahul";
        emp1.salary = 60000;

        System.out.println("Original Employee");
        emp1.display();

        System.out.println();

        System.out.println("Cloned Employee");
        emp2.display();
    }
}