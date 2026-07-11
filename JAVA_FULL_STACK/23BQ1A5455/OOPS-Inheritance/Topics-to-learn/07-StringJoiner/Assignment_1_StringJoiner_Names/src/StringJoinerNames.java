import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name " + i + ": ");
            sj.add(sc.nextLine());
        }

        System.out.println("Result: " + sj);

        sc.close();
    }

}