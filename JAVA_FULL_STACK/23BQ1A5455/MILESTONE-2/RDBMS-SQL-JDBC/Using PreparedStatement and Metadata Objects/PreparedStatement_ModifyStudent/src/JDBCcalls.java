public class JDBCcalls {

    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Usage: java JDBCcalls <RollNo> <NewFees>");
            return;
        }

        int rollNo = Integer.parseInt(args[0]);
        double fees = Double.parseDouble(args[1]);

        DAOClass dao = new DAOClass();
        dao.updateFees(rollNo, fees);
    }
}