import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerMerge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");

        System.out.print("Enter number of cities for StringJoiner 1: ");
        int n1 = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n1; i++) {
            System.out.print("Enter city " + i + ": ");
            s1.add(sc.nextLine());
        }

        System.out.print("Enter number of cities for StringJoiner 2: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n2; i++) {
            System.out.print("Enter city " + i + ": ");
            s2.add(sc.nextLine());
        }

        System.out.println("\nOriginal StringJoiners:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        StringJoiner mergeS1 = new StringJoiner("-");
        mergeS1.merge(s1);
        mergeS1.merge(s2);

        StringJoiner mergeS2 = new StringJoiner("-");
        mergeS2.merge(s2);
        mergeS2.merge(s1);

        System.out.println("\n(i) s1 merged to s2:");
        System.out.println(mergeS1);

        System.out.println("\n(ii) s2 merged to s1:");
        System.out.println(mergeS2);

        sc.close();
    }

}