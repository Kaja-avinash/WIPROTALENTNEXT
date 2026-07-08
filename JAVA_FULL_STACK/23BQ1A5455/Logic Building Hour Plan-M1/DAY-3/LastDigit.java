package day3;

import java.util.Scanner;

public class LastDigit {

    public static int getLastDigit(int number) {

        return Math.abs(number % 10);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int lastDigit = getLastDigit(number);

        System.out.println("Last Digit = " + lastDigit);

        sc.close();
    }
}