import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryEmp {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "system";
        String password = "Avinash@55";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");

            System.out.println("EMPNO\tENAME");

            while (rs.next()) {

                int empNo = rs.getInt(1); // Using column index
                String empName = rs.getString("ENAME"); // Using column name

                System.out.println(empNo + "\t" + empName);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}