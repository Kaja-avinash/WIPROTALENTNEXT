import java.sql.*;
import java.util.ArrayList;

public class DAOClass {

    Connection con;

    public DAOClass() {
        con = DBConnection.getConnection();
    }

    // Scenario 1
    public String getUserType(String userID) {

        String userType = null;

        try {

            String query = "SELECT USERTYPE FROM USERDETAILS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userType = rs.getString("USERTYPE");
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userType;
    }

    // Scenario 2
    public String getIncorrectAttempts(String userID) {

        String result = "Incorrect Attempt Exceeded";

        try {

            String query = "SELECT INCORRECTATTEMPTS FROM USERDETAILS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int attempts = rs.getInt("INCORRECTATTEMPTS");

                if (attempts == 0)
                    result = "No Incorrect Attempt";
                else if (attempts == 1)
                    result = "One Time";
                else
                    result = "Incorrect Attempt Exceeded";

            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // Scenario 3
    public String changeUserType(String userID) {

        String message = "Update Failed";

        try {

            con.setAutoCommit(false);

            String query = "UPDATE USERDETAILS SET USERTYPE='Admin' WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, userID);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                con.commit();
                message = "Update Success";

            } else {

                con.rollback();

            }

            ps.close();

        } catch (Exception e) {

            try {
                con.rollback();
            } catch (Exception ex) {
            }

            e.printStackTrace();
        }

        return message;
    }

    // Scenario 4
    public int getLockStatus() {

        int count = 0;

        try {

            String query = "SELECT COUNT(*) FROM USERDETAILS WHERE LOCKSTATUS=0";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    // Scenario 5
    public String changeName(String id, String name) {

        String message = "Failed";

        try {

            con.setAutoCommit(false);

            String query = "UPDATE USERDETAILS SET NAME=? WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                con.commit();
                message = "Success";

            } else {

                con.rollback();

            }

            ps.close();

        } catch (Exception e) {

            try {
                con.rollback();
            } catch (Exception ex) {
            }

            e.printStackTrace();
        }

        return message;
    }

    // Scenario 6
    public String changePassword(String password) {

        String result = "0";

        try {

            String query = "UPDATE USERDETAILS SET PASSWORD=? WHERE USERTYPE='Admin'";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, password);

            int rows = ps.executeUpdate();

            if (rows > 0)
                result = "Changed";

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // Scenario 7
    public String addUser_1(UserBean bean) {

        String result = "Fail";

        try {

            String query = "INSERT INTO USERDETAILS VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, bean.getUserID());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setInt(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());

            int rows = ps.executeUpdate();

            if (rows > 0)
                result = "Success";

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // Scenario 8
    public String addUser_2(UserBean bean) {

        String result = "Fail";

        try {

            if (bean.getLockStatus() != 0)
                return result;

            String query = "INSERT INTO USERDETAILS VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, bean.getUserID());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setInt(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());

            int rows = ps.executeUpdate();

            if (rows > 0)
                result = "Success";

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // Scenario 9
    public ArrayList<UserBean> getUsers(String userType) {

        ArrayList<UserBean> list = new ArrayList<>();

        try {

            String query = "SELECT * FROM USERDETAILS WHERE USERTYPE=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, userType);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                UserBean bean = new UserBean();

                bean.setUserID(rs.getString("USERID"));
                bean.setPassword(rs.getString("PASSWORD"));
                bean.setName(rs.getString("NAME"));
                bean.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
                bean.setLockStatus(rs.getInt("LOCKSTATUS"));
                bean.setUserType(rs.getString("USERTYPE"));

                list.add(bean);
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Scenario 10
    public ArrayList<UserBean> storeAllRecords() {

        ArrayList<UserBean> list = new ArrayList<>();

        try {

            String query = "SELECT * FROM USERDETAILS";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                UserBean bean = new UserBean();

                bean.setUserID(rs.getString("USERID"));
                bean.setPassword(rs.getString("PASSWORD"));
                bean.setName(rs.getString("NAME"));
                bean.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
                bean.setLockStatus(rs.getInt("LOCKSTATUS"));
                bean.setUserType(rs.getString("USERTYPE"));

                list.add(bean);

            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Scenario 11
    public String[] getNames() {

        ArrayList<String> names = new ArrayList<>();

        try {

            String query = "SELECT NAME FROM USERDETAILS";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                names.add(rs.getString("NAME"));

            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return names.toArray(new String[0]);
    }
}