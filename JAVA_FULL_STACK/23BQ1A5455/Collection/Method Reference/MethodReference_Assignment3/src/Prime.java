public class Prime {

    public Prime(int number) {

        boolean prime = true;

        if (number <= 1) {

            prime = false;

        } else {

            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {

                    prime = false;

                    break;

                }

            }

        }

        if (prime)

            System.out.println(number + " is Prime");

        else

            System.out.println(number + " is Not Prime");

    }

}