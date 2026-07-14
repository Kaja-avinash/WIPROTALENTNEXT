public class DigitCountDemo {

    public static int digitCount(int n) {

        n = Math.abs(n);

        if (n == 0)

            return 1;

        int count = 0;

        while (n != 0) {

            count++;

            n /= 10;

        }

        return count;

    }

    public static void main(String[] args) {

        DigitCount d = DigitCountDemo::digitCount;

        System.out.println("Digits = " + d.count(123456));

    }

}