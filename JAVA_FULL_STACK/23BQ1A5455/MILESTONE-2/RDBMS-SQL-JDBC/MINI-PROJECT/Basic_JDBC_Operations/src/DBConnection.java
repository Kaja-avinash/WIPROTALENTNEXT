import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con;

    public static Connection getConnection() {

        try {

            if (con == null || con.isClosed()) {

                Class.forName("oracle.jdbc.driver.OracleDriver");

                con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:XE",
                        "system",
                        "Avinash@55");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}