package day2;

import java.util.Scanner;

public class GreaterOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is the greater number.");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is the greater number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}