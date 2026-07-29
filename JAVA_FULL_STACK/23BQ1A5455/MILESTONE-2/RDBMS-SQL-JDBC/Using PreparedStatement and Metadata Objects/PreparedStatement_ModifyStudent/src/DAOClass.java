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

    public void updateFees(int rollNo, double fees) {

        try {

            String sql = "UPDATE STUDENT SET FEES = ? WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, fees);
            ps.setInt(2, rollNo);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Record Updated Successfully");
            else
                System.out.println("Student Record Not Found");

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}