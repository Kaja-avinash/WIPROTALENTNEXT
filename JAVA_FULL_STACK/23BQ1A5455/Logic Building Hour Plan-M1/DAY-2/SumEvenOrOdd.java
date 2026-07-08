package day2;

import java.util.Scanner;

public class SumEvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum = " + sum);

        if (sum % 2 == 0) {
            System.out.println("The sum is Even.");
        } else {
            System.out.println("The sum is Odd.");
        }

        sc.close();
    }
}