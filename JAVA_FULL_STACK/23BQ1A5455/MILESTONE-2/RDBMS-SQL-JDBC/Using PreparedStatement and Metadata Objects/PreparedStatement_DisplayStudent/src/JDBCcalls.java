public class JDBCcalls {

    public static void main(String args[]) {

        DAOClass dao = new DAOClass();

        if (args.length == 0) {

            // Display all students
            dao.displayAllStudents();

        } else if (args.length == 1) {

            // Display one student
            int rollNo = Integer.parseInt(args[0]);
            dao.displayStudent(rollNo);

        } else {

            System.out.println("Usage:");
            System.out.println("java JDBCcalls");
            System.out.println("or");
            System.out.println("java JDBCcalls <RollNo>");

        }
    }
}