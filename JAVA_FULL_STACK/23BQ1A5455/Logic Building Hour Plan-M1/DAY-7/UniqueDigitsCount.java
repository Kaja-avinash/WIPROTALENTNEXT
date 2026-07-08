package day7;

import java.util.Scanner;

public class UniqueDigitsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        boolean[] digitSeen = new boolean[10];

        int uniqueCount = 0;

        if (number == 0) {
            uniqueCount = 1;
        } else {

            while (number > 0) {

                int digit = number % 10;

                if (!digitSeen[digit]) {
                    digitSeen[digit] = true;
                    uniqueCount++;
                }

                number = number / 10;

            }

        }

        System.out.println("Unique Digits Count = " + uniqueCount);

        sc.close();
    }
}