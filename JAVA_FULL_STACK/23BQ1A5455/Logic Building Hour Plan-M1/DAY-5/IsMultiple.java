package day5;

import java.util.Scanner;

public class IsMultiple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter M: ");
        int m = sc.nextInt();

        if (m == 0) {
            System.out.println("Division by zero is not allowed.");
        } else if (n % m == 0) {
            System.out.println(n + " is an exact multiple of " + m + ".");
        } else {
            System.out.println(n + " is not an exact multiple of " + m + ".");
        }

        sc.close();
    }
}