import java.util.Arrays;

public class ArrayAssignment6 {

    public static void main(String[] args) {

        int[] arr = { 25, 10, 45, 5, 60, 18 };

        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}