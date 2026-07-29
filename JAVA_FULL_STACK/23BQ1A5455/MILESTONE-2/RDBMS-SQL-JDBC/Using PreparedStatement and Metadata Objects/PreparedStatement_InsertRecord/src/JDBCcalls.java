public class JDBCcalls {

    public static void main(String[] args) {

        if (args.length != 5) {
            System.out.println("Invalid Input");
            return;
        }

        int rollNo = Integer.parseInt(args[0]);
        String studentName = args[1];
        String standard = args[2];
        String dob = args[3];
        double fees = Double.parseDouble(args[4]);

        // RollNo validation
        if (rollNo < 1000 || rollNo > 9999) {
            System.out.println("Invalid Roll Number");
            return;
        }

        // Student Name validation
        if (!studentName.matches("[A-Z]{1,20}")) {
            System.out.println("Invalid Student Name");
            return;
        }

        // Standard validation
        if (!standard.matches("I|II|III|IV|V|VI|VII|VIII|IX|X")) {
            System.out.println("Invalid Standard");
            return;
        }

        DAOClass dao = new DAOClass();
        dao.insert(rollNo, studentName, standard, dob, fees);
    }
}