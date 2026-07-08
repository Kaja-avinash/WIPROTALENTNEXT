package day6;

import java.util.Scanner;

public class NthPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            int count = 0;
            int number = 1;

            while (count < n) {

                number++;

                boolean isPrime = true;

                for (int i = 2; i < number; i++) {

                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }

                }

                if (isPrime) {
                    count++;
                }

            }

            System.out.println("The " + n + "th Prime Number is " + number + ".");

        }

        sc.close();
    }
}