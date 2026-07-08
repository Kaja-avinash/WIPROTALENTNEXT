package day7;

import java.util.Scanner;

public class AllDigitsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int digitCount = 0;

        if (number == 0) {
            digitCount = 1;
        } else {

            while (number > 0) {

                digitCount++;
                number = number / 10;

            }

        }

        System.out.println("Total Number of Digits = " + digitCount);

        sc.close();
    }
}