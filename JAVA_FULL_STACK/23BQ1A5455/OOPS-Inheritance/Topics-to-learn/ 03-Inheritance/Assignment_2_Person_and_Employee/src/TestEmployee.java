public class TestEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee(
                "Avinash",
                600000,
                2026,
                "NI123456");

        System.out.println("Employee Name : " + employee.getName());
        System.out.println("Annual Salary : " + employee.getAnnualSalary());
        System.out.println("Year Started  : " + employee.getYearStarted());
        System.out.println("Insurance No. : " + employee.getNationalInsuranceNumber());

    }

}