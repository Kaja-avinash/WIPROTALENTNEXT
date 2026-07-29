public class JDBCcalls {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java JDBCcalls <RollNo>");
            return;
        }

        int rollNo = Integer.parseInt(args[0]);

        DAOClass dao = new DAOClass();
        dao.deleteStudent(rollNo);
    }
}