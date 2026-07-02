import java.util.Scanner;

public class ForLoopAssignment15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        for (; number > 0; number = number / 10) {
            sum = sum + (number % 10);
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}