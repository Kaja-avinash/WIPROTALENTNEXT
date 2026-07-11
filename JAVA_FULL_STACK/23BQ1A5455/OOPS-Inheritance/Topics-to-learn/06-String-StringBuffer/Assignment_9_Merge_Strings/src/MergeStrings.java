import java.util.Scanner;

public class MergeStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        String result = "";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        result += a.substring(min);
        result += b.substring(min);

        System.out.println(result);

        sc.close();
    }

}