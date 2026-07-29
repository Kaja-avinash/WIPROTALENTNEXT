import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "system";
        String password = "Avinash@55"; // Replace if this isn't your SYSTEM password

        try {

            // Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connection Established Successfully");
            }

            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            e.printStackTrace();

        }

    }
}