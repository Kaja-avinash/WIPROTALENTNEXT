import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAOClass {

    private Connection con;

    public DAOClass() {

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "system";
        String password = "Avinash@55";

        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(int rollNo, String studentName, String standard,
            String dob, double fees) {

        try {

            String query = "INSERT INTO STUDENT VALUES (?, ?, ?, TO_DATE(?, 'DD-MON-YYYY'), ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, rollNo);
            ps.setString(2, studentName);
            ps.setString(3, standard);
            ps.setString(4, dob);
            ps.setDouble(5, fees);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Record Inserted Successfully");
            }

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}