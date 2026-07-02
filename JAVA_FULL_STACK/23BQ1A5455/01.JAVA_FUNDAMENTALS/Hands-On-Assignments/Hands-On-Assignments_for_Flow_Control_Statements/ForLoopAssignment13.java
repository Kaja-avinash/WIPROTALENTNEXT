public class ForLoopAssignment13 {

    public static void main(String[] args) {

        for (int number = 10; number <= 99; number++) {

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.out.println(number);
            }

        }

    }
}