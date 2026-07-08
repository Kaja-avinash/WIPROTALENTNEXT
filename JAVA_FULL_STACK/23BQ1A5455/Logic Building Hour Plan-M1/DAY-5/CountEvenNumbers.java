package day5;

import java.util.Scanner;

public class CountEvenNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int evenCount = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number " + i + ": ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenCount++;
            }

        }

        System.out.println("Number of Even Numbers = " + evenCount);

        sc.close();
    }
}