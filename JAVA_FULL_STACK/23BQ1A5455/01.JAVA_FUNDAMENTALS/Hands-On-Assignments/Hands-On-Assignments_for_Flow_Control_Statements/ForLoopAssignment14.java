public class ForLoopAssignment14 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int number = Integer.parseInt(args[0]);

        if (number == 0 || number == 1) {
            System.out.println(number + " is neither prime nor composite");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}