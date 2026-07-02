public class Project1 {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter Employee ID");
            return;
        }

        Employee[] emp = {

                new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),

                new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),

                new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),

                new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),

                new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),

                new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400),

                new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)

        };

        int empId = Integer.parseInt(args[0]);

        Employee employee = null;

        for (int i = 0; i < emp.length; i++) {

            if (emp[i].empNo == empId) {
                employee = emp[i];
                break;
            }

        }

        if (employee == null) {
            System.out.println("There is no employee with empid : " + empId);
            return;
        }

        String designation = "";
        int da = 0;

        switch (employee.designationCode) {

            case 'e':
                designation = "Engineer";
                da = 20000;
                break;

            case 'c':
                designation = "Consultant";
                da = 32000;
                break;

            case 'k':
                designation = "Clerk";
                da = 12000;
                break;

            case 'r':
                designation = "Receptionist";
                da = 15000;
                break;

            case 'm':
                designation = "Manager";
                da = 40000;
                break;

            default:
                System.out.println("Invalid Designation Code");
                return;
        }

        int salary = employee.basic + employee.hra + da - employee.it;

        System.out.printf("%-8s %-12s %-18s %-15s %-10s%n",
                "Emp No.", "Emp Name", "Department", "Designation", "Salary");

        System.out.printf("%-8d %-12s %-18s %-15s %-10d%n",
                employee.empNo,
                employee.empName,
                employee.department,
                designation,
                salary);

    }
}