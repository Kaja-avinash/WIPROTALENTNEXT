import java.util.Scanner;

public class WhileLoopAssignment18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long originalNumber = number;
        long reverse = 0;

        while (number > 0) {

            long digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;

        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome");
        } else {
            System.out.println(originalNumber + " is not a palindrome");
        }

        sc.close();
    }
}