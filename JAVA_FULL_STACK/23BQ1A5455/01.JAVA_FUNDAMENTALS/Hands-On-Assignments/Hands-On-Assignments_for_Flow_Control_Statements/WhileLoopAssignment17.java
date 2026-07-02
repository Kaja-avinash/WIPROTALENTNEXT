import java.util.Scanner;

public class WhileLoopAssignment17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long reverse = 0;

        while (number > 0) {

            long digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;

        }

        System.out.println("Reverse = " + reverse);

        sc.close();
    }
}