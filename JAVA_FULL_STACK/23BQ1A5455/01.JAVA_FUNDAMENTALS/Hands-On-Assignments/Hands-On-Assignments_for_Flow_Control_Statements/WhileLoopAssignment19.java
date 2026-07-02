public class WhileLoopAssignment19 {

    public static void main(String[] args) {

        int number = 1;
        int count = 0;

        while (count < 5) {

            if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
                count++;
            }

            number++;
        }

    }
}