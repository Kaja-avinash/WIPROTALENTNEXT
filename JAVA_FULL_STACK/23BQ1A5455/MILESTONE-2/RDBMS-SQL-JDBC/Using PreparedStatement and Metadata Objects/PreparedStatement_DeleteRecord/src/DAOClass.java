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

    public void deleteStudent(int rollNo) {

        try {

            // Step 1: Get student details
            String selectQuery = "SELECT * FROM STUDENT WHERE ROLLNO = ?";
            PreparedStatement ps1 = con.prepareStatement(selectQuery);
            ps1.setInt(1, rollNo);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {

                String studentName = rs.getString("STUDENTNAME");
                String standard = rs.getString("STANDARD");

                // Step 2: Insert into STUDENTLOG
                String insertLog =
                        "INSERT INTO STUDENTLOG (ROLLNO, STUDENTNAME, STANDARD, LEAVING_DATE) " +
                        "VALUES (?, ?, ?, SYSDATE)";

                PreparedStatement ps2 = con.prepareStatement(insertLog);

                ps2.setInt(1, rollNo);
                ps2.setString(2, studentName);
                ps2.setString(3, standard);

                ps2.executeUpdate();

                // Step 3: Delete from STUDENT
                String deleteQuery = "DELETE FROM STUDENT WHERE ROLLNO = ?";

                PreparedStatement ps3 = con.prepareStatement(deleteQuery);
                ps3.setInt(1, rollNo);

                int rows = ps3.executeUpdate();

                if (rows > 0)
                    System.out.println("Student Record Deleted Successfully");
                else
                    System.out.println("Deletion Failed");

                ps2.close();
                ps3.close();

            } else {

                System.out.println("Student Record Not Found");

            }

            rs.close();
            ps1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}