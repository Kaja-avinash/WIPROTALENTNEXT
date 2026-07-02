import java.util.Arrays;

public class ArrayAssignment5 {

    public static void main(String[] args) {

        int[] arr = { 25, 10, 45, 5, 60, 18 };

        Arrays.sort(arr);

        System.out.println("Smallest Number = " + arr[0]);
        System.out.println("Second Smallest Number = " + arr[1]);

        System.out.println("Largest Number = " + arr[arr.length - 1]);
        System.out.println("Second Largest Number = " + arr[arr.length - 2]);

    }
}