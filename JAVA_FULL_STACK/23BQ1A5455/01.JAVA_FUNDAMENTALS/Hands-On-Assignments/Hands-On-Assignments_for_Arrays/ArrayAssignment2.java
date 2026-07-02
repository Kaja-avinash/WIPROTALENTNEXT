public class ArrayAssignment2 {

    public static void main(String[] args) {

        int[] arr = { 25, 10, 45, 5, 60, 18 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println("Maximum Value = " + max);
        System.out.println("Minimum Value = " + min);

    }
}