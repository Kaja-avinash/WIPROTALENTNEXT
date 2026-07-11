import java.util.Scanner;

public class BeforeAfterString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String a: ");
        String a = sc.nextLine();

        System.out.print("Enter String b: ");
        String b = sc.nextLine();

        String result = "";

        int index = 0;

        while ((index = a.indexOf(b, index)) != -1) {

            if (index > 0) {
                result += a.charAt(index - 1);
            }

            if (index + b.length() < a.length()) {
                result += a.charAt(index + b.length());
            }

            index += b.length();
        }

        System.out.println(result);

        sc.close();
    }

}