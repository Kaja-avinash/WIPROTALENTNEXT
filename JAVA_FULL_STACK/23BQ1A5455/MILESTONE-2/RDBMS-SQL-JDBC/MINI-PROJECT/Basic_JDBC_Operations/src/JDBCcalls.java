import java.util.ArrayList;

public class JDBCcalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        /*
         * ==========================================================
         * COMPILE & RUN COMMANDS
         * ==========================================================
         * 
         * Compile:
         * javac -cp ".;lib/*" -d bin src/*.java
         * 
         * Execute:
         * java -cp ".;bin;lib/*" JDBCcalls
         * 
         * ==========================================================
         */

        // ==========================================================
        // Scenario 1 : getUserType(String userID)
        // Expected Output : Admin
        // ==========================================================

        /*
         * System.out.println(dao.getUserType("AB1001"));
         */

        // ==========================================================
        // Scenario 2 : getIncorrectAttempts(String userID)
        // Test Case 1:
        // INCORRECTATTEMPTS = 0
        // Expected : No Incorrect Attempt
        //
        // Test Case 2:
        // INCORRECTATTEMPTS = 3
        // Expected : Incorrect Attempt Exceeded
        // ==========================================================

        /*
         * System.out.println(dao.getIncorrectAttempts("AB1001"));
         */

        // ==========================================================
        // Scenario 3 : changeUserType(String userID)
        // Changes Employee -> Admin
        // Expected Output : Update Success
        // ==========================================================

        /*
         * System.out.println(dao.changeUserType("RS1003"));
         */

        // ==========================================================
        // Scenario 4 : getLockStatus()
        // Expected:
        // 0 -> All Users are Unlocked
        // 1 -> One or More Users are Locked
        // ==========================================================

        /*
         * System.out.println(dao.getLockStatus());
         */

        // ==========================================================
        // Scenario 5 : changeName(String id, String name)
        // Expected Output : Success
        // ==========================================================

        /*
         * System.out.println(
         * dao.changeName("RS1003", "Ganesh Kumar"));
         */

        // ==========================================================
        // Scenario 6 : changePassword(String password)
        // Changes password of AB1001
        // Expected Output : Changed
        // ==========================================================

        /*
         * System.out.println(
         * dao.changePassword("Welcome123"));
         */

        // ==========================================================
        // Scenario 7 : addUser_1(UserBean bean)
        // Expected Output : Success
        // ==========================================================

        /*
         * UserBean bean = new UserBean();
         * 
         * bean.setUserID("AR1004");
         * bean.setPassword("AR1004");
         * bean.setName("Arun");
         * bean.setIncorrectAttempts(0);
         * bean.setLockStatus(0);
         * bean.setUserType("Employee");
         * 
         * System.out.println(
         * dao.addUser_1(bean));
         */

        // ==========================================================
        // Scenario 8 : addUser_2(UserBean bean)
        //
        // Success Test:
        // bean.setLockStatus(0);
        // Expected : Success
        //
        // Failure Test:
        // bean.setLockStatus(1);
        // Expected : Fail
        // ==========================================================

        /*
         * UserBean bean = new UserBean();
         * 
         * bean.setUserID("VK1005");
         * bean.setPassword("VK1005");
         * bean.setName("Vikas");
         * bean.setIncorrectAttempts(0);
         * 
         * // Change to 1 for Failure Test
         * bean.setLockStatus(0);
         * 
         * bean.setUserType("Employee");
         * 
         * System.out.println(
         * dao.addUser_2(bean));
         */

        // ==========================================================
        // Scenario 9 : getUsers(String userType)
        // Displays all Employee records
        // ==========================================================

        /*
         * ArrayList<UserBean> list =
         * dao.getUsers("Employee");
         * 
         * for(UserBean b : list)
         * {
         * System.out.println("--------------------------------");
         * System.out.println("User ID : " + b.getUserID());
         * System.out.println("Password : " + b.getPassword());
         * System.out.println("Name : " + b.getName());
         * System.out.println("Incorrect Attempts : " + b.getIncorrectAttempts());
         * System.out.println("Lock Status : " + b.getLockStatus());
         * System.out.println("User Type : " + b.getUserType());
         * }
         */

        // ==========================================================
        // Scenario 10 : storeAllRecords()
        // Displays all records from USERDETAILS table
        // ==========================================================

        /*
         * ArrayList<UserBean> list =
         * dao.storeAllRecords();
         * 
         * for(UserBean b : list)
         * {
         * System.out.println("--------------------------------");
         * System.out.println("User ID : " + b.getUserID());
         * System.out.println("Password : " + b.getPassword());
         * System.out.println("Name : " + b.getName());
         * System.out.println("Incorrect Attempts : " + b.getIncorrectAttempts());
         * System.out.println("Lock Status : " + b.getLockStatus());
         * System.out.println("User Type : " + b.getUserType());
         * }
         */

        // ==========================================================
        // Scenario 11 : getNames()
        // Displays all names from USERDETAILS table
        // ==========================================================

        /*
         * String[] names = dao.getNames();
         * 
         * System.out.println("Names in USERDETAILS Table");
         * System.out.println("--------------------------");
         * 
         * for(String name : names)
         * {
         * System.out.println(name);
         * }
         */

    }
}