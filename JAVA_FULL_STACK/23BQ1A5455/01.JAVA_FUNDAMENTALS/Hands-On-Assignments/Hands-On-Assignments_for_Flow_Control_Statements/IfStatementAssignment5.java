public class IfStatementAssignment5 {

    public static void main(String[] args) {

        String input = args[0];

        // Check if input contains only alphabets
        if (input.matches("[a-zA-Z]+")) {
            System.out.println("Alphabet");
        }

        // Check if input contains only digits
        else if (input.matches("[0-9]+")) {
            System.out.println("Digit");
        }

        // Check if input is exactly one special character
        else if (input.length() == 1) {
            System.out.println("Special Character");
        }

        // Mixed input
        else {
            System.out.println("Invalid Input");
        }
    }
}