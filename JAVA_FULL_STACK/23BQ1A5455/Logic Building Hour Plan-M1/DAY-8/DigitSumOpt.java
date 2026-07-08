package day8;

import java.util.Scanner;

public class DigitSumOpt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Enter your choice:");
        System.out.println("1. Sum of Even Digits");
        System.out.println("2. Sum of Odd Digits");

        int choice = sc.nextInt();

        number = Math.abs(number);

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            if (choice == 1 && digit % 2 == 0) {
                sum = sum + digit;
            } else if (choice == 2 && digit % 2 != 0) {
                sum = sum + digit;
            }

            number = number / 10;
        }

        if (choice == 1) {
            System.out.println("Sum of Even Digits = " + sum);
        } else if (choice == 2) {
            System.out.println("Sum of Odd Digits = " + sum);
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}