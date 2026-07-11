import java.util.Scanner;

public class StudentAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int student = 1; student <= 2; student++) {

                System.out.println("Enter marks for Student " + student);

                int sum = 0;

                for (int subject = 1; subject <= 3; subject++) {

                    System.out.print("Subject " + subject + ": ");

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0 || mark > 100) {
                        throw new InvalidMarksException(
                                "Marks should be between 0 and 100");
                    }

                    sum += mark;
                }

                double average = sum / 3.0;

                System.out.println("Average Marks = " + average);
                System.out.println();

            }

        }
        catch (NumberFormatException e) {

            System.out.println("NumberFormatException : Please enter only integers.");

        }
        catch (InvalidMarksException e) {

            System.out.println(e.getMessage());

        }

        sc.close();

    }

}