import java.util.Scanner;

public class FirstTwoCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String firstTwo = str.substring(0, 2);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(firstTwo);
        }

        sc.close();
    }

}