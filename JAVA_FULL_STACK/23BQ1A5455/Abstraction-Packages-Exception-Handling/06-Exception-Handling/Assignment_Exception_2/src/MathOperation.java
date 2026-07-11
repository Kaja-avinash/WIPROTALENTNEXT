public class MathOperation {

    public static void main(String[] args) throws NumberFormatException {

        int[] numbers = new int[5];

        int sum = 0;

        for (int i = 0; i < 5; i++) {

            numbers[i] = Integer.parseInt(args[i]);
            sum += numbers[i];

        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }

}