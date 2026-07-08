package day3;

import java.util.Scanner;

public class IsOdd {

    public static int isOdd(int number) {

        if (number % 2 != 0) {
            return 2;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = isOdd(number);

        System.out.println("Output: " + result);

        sc.close();
    }
}