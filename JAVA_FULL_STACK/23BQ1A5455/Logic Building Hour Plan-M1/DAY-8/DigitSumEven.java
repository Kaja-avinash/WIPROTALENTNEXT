package day8;

import java.util.Scanner;

public class DigitSumEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            if (digit % 2 == 0) {
                sum = sum + digit;
            }

            number = number / 10;
        }

        System.out.println("Sum of Even Digits = " + sum);

        sc.close();
    }
}