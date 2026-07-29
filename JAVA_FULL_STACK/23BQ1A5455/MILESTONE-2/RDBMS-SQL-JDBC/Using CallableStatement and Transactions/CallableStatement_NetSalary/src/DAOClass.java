import java.sql.*;

public class DAOClass {

    Connection con;

    public DAOClass() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "system",
                    "Avinash@55");

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayNetSalary() {

        try {

            String query = "SELECT EMPNO, ENAME FROM EMP ORDER BY EMPNO";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            System.out.println("--------------------------------------------");
            System.out.printf("%-8s %-12s %-12s%n",
                    "EMPNO", "ENAME", "NET SALARY");
            System.out.println("--------------------------------------------");

            while (rs.next()) {

                int empNo = rs.getInt("EMPNO");
                String empName = rs.getString("ENAME");

                CallableStatement cs =
                        con.prepareCall("{call CALCULATE_NETSAL(?, ?)}");

                cs.setInt(1, empNo);
                cs.registerOutParameter(2, Types.NUMERIC);

                cs.execute();

                double netSalary = cs.getDouble(2);

                System.out.printf("%-8d %-12s %-12.2f%n",
                        empNo, empName, netSalary);

                cs.close();
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}