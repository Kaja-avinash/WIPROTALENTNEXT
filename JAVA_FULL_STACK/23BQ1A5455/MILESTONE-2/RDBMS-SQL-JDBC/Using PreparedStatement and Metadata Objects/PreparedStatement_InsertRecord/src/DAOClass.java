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

    public void insert(int rollNo, String studentName,
                       String standard, String dob, double fees) {

        try {

            String sql = "INSERT INTO STUDENT VALUES (?, ?, ?, TO_DATE(?, 'DD-MON-YYYY'), ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollNo);
            ps.setString(2, studentName);
            ps.setString(3, standard);
            ps.setString(4, dob);
            ps.setDouble(5, fees);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Record Inserted Successfully");
            else
                System.out.println("Insertion Failed");

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}