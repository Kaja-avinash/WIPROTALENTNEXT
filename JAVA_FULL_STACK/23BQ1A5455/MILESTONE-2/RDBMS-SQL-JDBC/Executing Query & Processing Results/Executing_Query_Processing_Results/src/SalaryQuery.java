import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SalaryQuery {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "system";
        String password = "Avinash@55";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT ENAME, JOB, SAL, COMM FROM EMP WHERE SAL > 1000 AND SAL < 2000");

            System.out.println("ENAME\tJOB\t\tSAL\tCOMM");

            while (rs.next()) {

                String ename = rs.getString("ENAME");
                String job = rs.getString("JOB");
                double sal = rs.getDouble("SAL");
                double comm = rs.getDouble("COMM");

                System.out.println(ename + "\t" + job + "\t" + sal + "\t" + comm);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}