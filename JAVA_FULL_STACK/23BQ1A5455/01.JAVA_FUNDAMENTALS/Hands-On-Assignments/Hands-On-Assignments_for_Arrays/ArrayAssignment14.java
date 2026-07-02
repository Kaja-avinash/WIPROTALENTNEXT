import java.util.Scanner;

public class ArrayAssignment14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];
        int[] result = new int[2];

        System.out.println("Enter the elements of first array:");

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of second array:");

        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        result[0] = a[1];
        result[1] = b[1];

        System.out.print("Output: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}