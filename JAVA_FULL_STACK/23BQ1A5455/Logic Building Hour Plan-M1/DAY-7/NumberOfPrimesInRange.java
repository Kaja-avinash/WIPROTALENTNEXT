package day7;

import java.util.Scanner;

public class NumberOfPrimesInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int primeCount = 0;

        for (int number = start; number <= end; number++) {

            if (number <= 1) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                primeCount++;
            }

        }

        System.out.println("Number of Prime Numbers = " + primeCount);

        sc.close();
    }
}