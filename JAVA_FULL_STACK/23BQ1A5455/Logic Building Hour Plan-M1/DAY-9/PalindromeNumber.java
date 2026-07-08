package day9;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = Math.abs(number);
        int temp = originalNumber;
        int reverse = 0;

        while (temp > 0) {

            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;

        }

        if (originalNumber == reverse) {
            System.out.println(number + " is a Palindrome Number.");
        } else {
            System.out.println(number + " is Not a Palindrome Number.");
        }

        sc.close();
    }
}