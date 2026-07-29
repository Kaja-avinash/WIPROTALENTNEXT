public class JDBCcalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        if (args.length == 6 && args[0].equals("1")) {

            int rollNo = Integer.parseInt(args[1]);
            String studentName = args[2];
            String standard = args[3];
            String dob = args[4];
            double fees = Double.parseDouble(args[5]);

            dao.insert(rollNo, studentName, standard, dob, fees);

        } else {

            System.out.println("Invalid Command");

            System.out.println("Usage:");
            System.out.println("java JDBCcalls 1 RollNo StudentName Standard DOB Fees");

        }
    }
}