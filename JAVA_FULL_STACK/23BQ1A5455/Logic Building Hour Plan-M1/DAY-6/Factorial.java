package day6;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + number + " = " + factorial);
        }

        sc.close();
    }
}