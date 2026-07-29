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

    // Display one student
    public void displayStudent(int rollNo) {

        try {

            String sql = "SELECT * FROM STUDENT WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rollNo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Roll No      : " + rs.getInt("ROLLNO"));
                System.out.println("Student Name : " + rs.getString("STUDENTNAME"));
                System.out.println("Standard     : " + rs.getString("STANDARD"));
                System.out.println("Date of Birth: " + rs.getDate("DATE_OF_BIRTH"));
                System.out.println("Fees         : " + rs.getDouble("FEES"));

            } else {

                System.out.println("Student Record Not Found");

            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Display all students
    public void displayAllStudents() {

        try {

            String sql = "SELECT * FROM STUDENT ORDER BY ROLLNO";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("ROLLNO") + "\t" +
                        rs.getString("STUDENTNAME") + "\t" +
                        rs.getString("STANDARD") + "\t" +
                        rs.getDate("DATE_OF_BIRTH") + "\t" +
                        rs.getDouble("FEES"));
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}