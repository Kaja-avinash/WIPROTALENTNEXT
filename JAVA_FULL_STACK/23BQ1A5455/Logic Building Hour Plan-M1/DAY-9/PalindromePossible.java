package day9;

import java.util.Scanner;

public class PalindromePossible {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int[] digitCount = new int[10];

        if (number == 0) {
            digitCount[0] = 1;
        } else {

            while (number > 0) {

                int digit = number % 10;
                digitCount[digit]++;

                number = number / 10;
            }

        }

        int oddCount = 0;

        for (int i = 0; i < 10; i++) {

            if (digitCount[i] % 2 != 0) {
                oddCount++;
            }

        }

        if (oddCount <= 1) {
            System.out.println("Palindrome Possible");
        } else {
            System.out.println("Palindrome Not Possible");
        }

        sc.close();
    }
}