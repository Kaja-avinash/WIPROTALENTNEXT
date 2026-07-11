public class TestPatient {

    public static void main(String[] args) {

        Patient patient = new Patient("Avinash", 1.75, 70);

        System.out.println("Patient Name : " + patient.getPatientName());
        System.out.printf("BMI : %.2f", patient.computeBMI());

    }

}