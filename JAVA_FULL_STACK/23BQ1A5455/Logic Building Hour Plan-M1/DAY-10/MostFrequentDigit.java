package day10;

import java.util.Scanner;

public class MostFrequentDigit {

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

        int maxCount = digitCount[0];
        int mostFrequentDigit = 0;

        for (int i = 1; i < 10; i++) {

            if (digitCount[i] > maxCount) {
                maxCount = digitCount[i];
                mostFrequentDigit = i;
            }

        }

        System.out.println("Most Frequent Digit = " + mostFrequentDigit);

        sc.close();
    }
}