import java.util.Scanner;

public class ConcatenateStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            System.out.println((str1 + str2.substring(1)).toLowerCase());
        } else {
            System.out.println((str1 + " " + str2).toLowerCase());
        }

        sc.close();
    }

}