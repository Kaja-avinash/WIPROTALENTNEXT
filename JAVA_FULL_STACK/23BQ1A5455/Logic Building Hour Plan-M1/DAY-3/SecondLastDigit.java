package day3;

import java.util.Scanner;

public class SecondLastDigit {

    public static int getSecondLastDigit(int number) {

        number = Math.abs(number);

        if (number < 10) {
            return -1;
        }

        return (number / 10) % 10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int secondLastDigit = getSecondLastDigit(number);

        System.out.println("Second Last Digit = " + secondLastDigit);

        sc.close();
    }
}