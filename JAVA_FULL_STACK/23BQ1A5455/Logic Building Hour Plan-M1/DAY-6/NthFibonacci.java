package day6;

import java.util.Scanner;

public class NthFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println("The 1st Fibonacci number is 0.");
        } else if (n == 2) {
            System.out.println("The 2nd Fibonacci number is 1.");
        } else {

            int first = 0;
            int second = 1;
            int next = 0;

            for (int i = 3; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println("The " + n + "th Fibonacci number is " + next + ".");
        }

        sc.close();
    }
}